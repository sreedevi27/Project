package com.User.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.User.Demo"})

public class MysqlEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlEmpApplication.class, args);
	}

}
