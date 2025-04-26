package com.binlaptop.laptopbin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopbinApplication {

	public static void main(String[] args) {

		// container
		ApplicationContext doanhbino = SpringApplication.run(LaptopbinApplication.class, args);
		for (String s : doanhbino.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
