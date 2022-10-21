package com.kiran.jenkinsdemo.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class JenkinsdemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@GetMapping("/welcome")
	public String welcomeMessage(){
		return  "Welcome to the Spring Boot";
	}

	@PostConstruct
	public void init(){
		logger.info("APPLICATION STARTED");
	}

	public static void main(String[] args) {
		logger.info("APPLICATION RUNNING");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
