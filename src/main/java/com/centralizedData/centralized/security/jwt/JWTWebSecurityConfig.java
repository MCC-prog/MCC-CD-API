package com.centralizedData.centralized.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@CrossOrigin(origins = "*", maxAge=3600)
public class JWTWebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	 @Autowired
	    private JwtUnAuthorizedResponseAuthenticationEntryPoint jwtUnAuthorizedResponseAuthenticationEntryPoint;

	    @Autowired
	    private UserDetailsService jwtInMemoryUserDetailsService;

	    @Autowired
	    private JwtTokenAuthorizationOncePerRequestFilter jwtAuthenticationTokenFilter;

	    @Value("${jwt.get.token.uri}")
	    private String authenticationPath;

	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	        auth
	            .userDetailsService(jwtInMemoryUserDetailsService)
	            .passwordEncoder(passwordEncoderBean());
//	        .passwordEncoder(NoOpPasswordEncoder.getInstance());
//	        .passwordEncoder();
	    }

	    @Bean
	    public PasswordEncoder passwordEncoderBean() {
	        return new BCryptPasswordEncoder();
	    }

	    @Bean
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }

	    @Override
	    protected void configure(HttpSecurity httpSecurity) throws Exception {
	        httpSecurity
	            .csrf().disable()
	            .exceptionHandling().authenticationEntryPoint(jwtUnAuthorizedResponseAuthenticationEntryPoint).and()
	            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
	            .authorizeRequests()
	          
	            .anyRequest().authenticated();

	       httpSecurity
	            .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class);
	        
	        httpSecurity
	            .headers()
	            .frameOptions().sameOrigin()  //H2 Console Needs this setting
	            .cacheControl(); //disable caching
	    }

	    @Override
	    public void configure(WebSecurity webSecurity) throws Exception {
	        webSecurity
	            .ignoring()
	            .antMatchers(
	                HttpMethod.POST,
	                authenticationPath
	            )
	            //Added by arun for swagger
	            .antMatchers("/swagger-ui/**", "/v3/api-docs/**")
	            .antMatchers(HttpMethod.OPTIONS, "/**")
	            .and()
	            .ignoring()
	            .antMatchers(
	                HttpMethod.GET,
	                "/" //Other Stuff You want to Ignore
	            );
//	            .and()
//	            .ignoring()
//	            .antMatchers("/h2-console/**/**");//Should not be in Production!
	    }

}
