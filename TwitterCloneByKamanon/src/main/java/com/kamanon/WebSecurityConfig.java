package com.kamanon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.kamanon.domain.service.userinfo.UserInfoDetailsService;

/**
 * フォーム認証の設定クラs
 * */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserInfoDetailsService userInfoDetailsService;

	private final String LOGIN_FORM = "/loginForm";
	private final String LOGIN_PROCESSING_URL = "/login";
	private final String DEFAULT_SUCCESS_URL = "/home";
	private final String FAILURE_URL = "/loginForm?error=true";

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/js/**", "/css/**").permitAll()
				.antMatchers("/**").authenticated()
				.and()
				.formLogin()
				.loginPage(LOGIN_FORM)
				.loginProcessingUrl(LOGIN_PROCESSING_URL)
				.usernameParameter("username")
				.passwordParameter("password")
				.defaultSuccessUrl(DEFAULT_SUCCESS_URL)
				.failureUrl(FAILURE_URL).permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userInfoDetailsService).passwordEncoder(passwordEncoder());
	}
}
