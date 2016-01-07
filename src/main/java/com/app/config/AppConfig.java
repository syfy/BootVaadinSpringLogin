package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.app.auth.AuthManager;
import com.app.auth.UserService;
import com.app.ui.LoginFormListener;

@Configuration
@ComponentScan(basePackages = { "com.app.ui", "com.app.auth", "com.app.service" })

public class AppConfig {
	@Bean
	public AuthManager authManager() {
		AuthManager res = new AuthManager();
		return res;
	}

	@Bean
	public UserService userService() {
		UserService res = new UserService();
		return res;
	}

	@Bean
	public LoginFormListener loginFormListener() {
		return new LoginFormListener();
	}

}
