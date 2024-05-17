package com.thinkxfactor.attendNow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AttendNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendNowApplication.class, args);

	}

}
//hello world API
//@RestController //marks a class as restful controller
//@RequestMapping("/api")
//class TestController{

	//@GetMapping("/hello")
	//public String hello()
	//{
		//System.out.println("Welcome");
		//return "Hello World from controller";

	//}
//}
