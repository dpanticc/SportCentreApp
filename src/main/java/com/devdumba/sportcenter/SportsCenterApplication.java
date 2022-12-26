package com.devdumba.sportcenter;

import com.devdumba.sportcenter.domain.AppUser;
import com.devdumba.sportcenter.domain.Role;
import com.devdumba.sportcenter.service.AppUserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SportsCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportsCenterApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
