package com.centralizedData.centralized.security.jwt;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.centralizedData.centralized.model.admin.McqPrivileges;
import com.centralizedData.centralized.model.user.User;
import com.centralizedData.centralized.repository.McqPrivilegesRepository;
import com.centralizedData.centralized.service.user.UserService;
import com.centralizedData.centralized.utils.EncryptUtil;



@Service
@Transactional
public class JwtInMemoryUserDetailsService implements UserDetailsService {
	@Autowired
	private UserService  userService;
	
	@Autowired
	private McqPrivilegesRepository mcqPrivilegesRepository;

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1, "akshu1",
        "$2a$10$Q4LfTVhKRjkB9R.CtWJYOOpIGdPYQdjDys3ePxi/F//ar3gIGkmYe", null,null,null));
    inMemoryUserList.add(new JwtUserDetails(2, "akshu",
            "123", null,null,null));
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userService.findByUserName(username);
    Set<String> roles = user.getUserRole().stream().map(userRole->userRole.getRole().getRoleName()).collect(Collectors.toSet());
    Set<String> mcqPrivilegeRole =  mcqPrivilegesRepository.getByUserId(user.getUserId()).stream()
    .map(McqPrivileges::getPrivilegeName)
    .collect(Collectors.toSet());
    JwtUserDetails jwt = null;
    if (user!=null) {
    	String hashedPwd = getPwd(EncryptUtil.getInstance().decryptDES(user.getPwd()));
    	jwt = new JwtUserDetails(user.getUserId(),user.getUserName(),
    			hashedPwd,roles,user.getJwtToken(),mcqPrivilegeRole);
    }
    return jwt;
  }
  
  public static String getPwd(String pwd) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd = null;
		if(pwd != null) {
			encodedPwd = encoder.encode(pwd);
		}
	   return encodedPwd;
	}

}
