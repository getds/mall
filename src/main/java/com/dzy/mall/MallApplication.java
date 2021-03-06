package com.dzy.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.dzy.mall.mapper")
public class MallApplication {
	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}
}
