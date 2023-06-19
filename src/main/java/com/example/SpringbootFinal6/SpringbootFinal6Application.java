package com.example.SpringbootFinal6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;  

@SpringBootApplication
public class SpringbootFinal6Application extends SpringBootServletInitializer {

	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(SpringbootFinal6Application.class);  
	}  
	public static void main(String[] args)   
	{  
	SpringApplication.run(SpringbootFinal6Application.class, args);  
		System.out.println("????????");
		System.out.println("111111");
	}  
	}  
