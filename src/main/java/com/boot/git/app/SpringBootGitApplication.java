package com.boot.git.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@ComponentScan
@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class SpringBootGitApplication {
	public static void main(String[] args) {
	SpringApplication.run(SpringBootGitApplication.class, args);
		SpringApplication.run(SpringBootGitApplication.class, args);
		SpringApplication.run(SpringBootGitApplication.class, args);
		SpringApplication.run(SpringBootGitApplication.class, args);
				SpringApplication.run(SpringBootGitApplication.class, branch2);
	}
}
