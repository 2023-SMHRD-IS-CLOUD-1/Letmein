package com.smhrd.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	      http.cors(AbstractHttpConfigurer::disable).httpBasic((basic) -> basic.disable()).csrf(csrf -> csrf.disable())
	            .authorizeRequests(authorize -> authorize
	                  .antMatchers("/avatar", "/codiTop", "/customerAll", "/customerNum", "/customerPost","/helpNo","/helpAnswer",
	                        "/like", "/unlike", "/countLike", "/countUser",
	                        "/join","/login","/loginChk","/nickFind","/logout","/profileEditor","/allUser","/UserSearch","/AdminDelete","/FindEmail",
	                        "/post", "/selectAll", "/searchTitle", "/searchWriter",
	                        "/postDelete", "/postModify", "/postNumFind", "/mypost", "/sortLike","/sortWriter","/sortTitle","/myLike"
	                        )
	                  .permitAll().antMatchers("/billing/**").hasRole("1").anyRequest().authenticated())
	            .formLogin(login -> login.disable()); 

	      return http.build();
	   }

	   @Bean
	   PasswordEncoder passwordEncoder() {
	      return new BCryptPasswordEncoder();
	      
	   }
 
}
