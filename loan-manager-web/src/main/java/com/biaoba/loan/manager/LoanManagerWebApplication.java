package com.biaoba.loan.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.biaoba.loan.manager")
@ComponentScan(basePackages = "com.biaoba.loan")
@SpringBootApplication
public class LoanManagerWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanManagerWebApplication.class, args);
	}
}
