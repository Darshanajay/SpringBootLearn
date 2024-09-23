package com.Annotations;

import com.Annotations.config.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AnnotationsApplication.class, args);
		ProductService pro = context.getBean(ProductService.class);
		ProductService pro1 = pro;
		pro1.ad();

	}

}
