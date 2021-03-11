package com.example.springBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootTutorialApplication.class, args);
		BeanDetail bA = context.getBean(BeanDetail.class);
		
		bA.show();
	}

}
