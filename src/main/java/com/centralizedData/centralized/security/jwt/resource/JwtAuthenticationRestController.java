package com.centralizedData.centralized.security.jwt.resource;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.centralizedData.centralized.model.user.User;
import com.centralizedData.centralized.security.jwt.JwtTokenUtil;
import com.centralizedData.centralized.security.jwt.JwtUserDetails;
import com.centralizedData.centralized.service.user.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Authentication", description = "Login and authentication APIs")
@RestController
@CrossOrigin(origins = "*", maxAge=3600)
public class JwtAuthenticationRestController {

	 @Value("${jwt.http.request.header}")
	  private String tokenHeader;

	  @Autowired
	  private AuthenticationManager authenticationManager;

	  @Autowired
	  private JwtTokenUtil jwtTokenUtil;

	  @Autowired
	  private UserDetailsService jwtInMemoryUserDetailsService;
	  
	  @Autowired
	  private UserService userService;

	  @RequestMapping(value = "${jwt.get.token.uri}", method = RequestMethod.POST)
	  public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtTokenRequest authenticationRequest)
	      throws AuthenticationException {
		  System.out.println("username");
	    authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

	    final UserDetails userDetails = jwtInMemoryUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
	    
	    final User user = userService.getUserIdByName(userDetails.getUsername());

	    final String token = jwtTokenUtil.generateToken(userDetails);
	    
	    userService.saveTokenById(user.getUserId(),token);

	    return ResponseEntity.ok(new JwtTokenResponse(token,userDetails.getUsername(), user.getUserId(),userDetails.getAuthorities().toString()));
	  }

	  @RequestMapping(value = "${jwt.refresh.token.uri}", method = RequestMethod.GET)
	  public ResponseEntity<?> refreshAndGetAuthenticationToken(HttpServletRequest request) {
	    String authToken = request.getHeader(tokenHeader);
	    final String token = authToken.substring(7);
	    String username = jwtTokenUtil.getUsernameFromToken(token);
	    JwtUserDetails user = (JwtUserDetails) jwtInMemoryUserDetailsService.loadUserByUsername(username);
	    final User userId = userService.getUserIdByName(user.getUsername());

	    if (jwtTokenUtil.canTokenBeRefreshed(token)) {
	      String refreshedToken = jwtTokenUtil.refreshToken(token);
	      userService.saveTokenById(userId.getUserId(),refreshedToken);
	      return ResponseEntity.ok(new JwtTokenResponse(refreshedToken, user.getUsername(),userId.getUserId(), user.getAuthorities().toString()));
	    } else {
	      return ResponseEntity.badRequest().body(null);
	    }
	  }
	  
	  
	  @RequestMapping(value = "/jwtLogout", method = RequestMethod.GET)
	  public ResponseEntity<?> logoutToken(HttpServletRequest request) {
		    String authToken = request.getHeader(tokenHeader);
		    final String token = authToken.substring(7);
		    String username = jwtTokenUtil.getUsernameFromToken(token);
		    userService.JwtLogOut(username);
	      return ResponseEntity.ok(new JwtSuccessResponse(HttpStatus.OK.value(), "Logged Out Successfully"));
	    
	  }

	  @ExceptionHandler({ AuthenticationException.class })
	  public ResponseEntity<String> handleAuthenticationException(AuthenticationException e) {
	    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
	  }

	  private void authenticate(String username, String password) {
	    Objects.requireNonNull(username);
	    Objects.requireNonNull(password);

	    try {
	      authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
	    } catch (DisabledException e) {
	      throw new AuthenticationException("USER_DISABLED", e);
	    } catch (BadCredentialsException e) {
	      throw new AuthenticationException("INVALID_CREDENTIALS", e);
	    }
	  }
}
