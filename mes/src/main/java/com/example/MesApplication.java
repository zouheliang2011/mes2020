package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mapper") //扫描的mapper
@SpringBootApplication(scanBasePackages = {
		"com.example.utils"
		,"com.example.controller"
		,"com.example.service"
})
public class MesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MesApplication.class, args);
	}
}
