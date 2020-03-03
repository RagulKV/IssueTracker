package com.mail;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.mail")
@SpringBootApplication
public class MailSetupApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MailSetupApplication.class, args);
	}

}
