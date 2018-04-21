package com.dzy.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MallApplication {
	@RequestMapping("/")
	String index(){
		return "hello world!";
	}
	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}
}
