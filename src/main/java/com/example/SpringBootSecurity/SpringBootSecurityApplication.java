package com.example.SpringBootSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootSecurityApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootSecurityApplication.class, args);
	}

	@GetMapping("/api")
	public String API()
	{
		return "Hit Rest API";
	}
}