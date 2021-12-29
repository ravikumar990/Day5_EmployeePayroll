
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayRoll1AppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Payroll Application");
		ApplicationContext context = SpringApplication.run(EmployeePayRoll1AppApplication.class, args);
		log.info("Employee Payroll App Started in {} Environment",context.getEnvironment().getProperty("environment"));
	}

}