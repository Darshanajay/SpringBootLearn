package com.springboot.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyInjApplication.class, args);



		DarshanMe obj = context.getBean(DarshanMe.class);
		obj.code();
	}

}
