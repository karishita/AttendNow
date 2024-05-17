package com.thinkxfactor.attendNow.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")

public class StudentController {

    @GetMapping("/hello")
	public String hello()
	{
		System.out.println("Welcome");
		return "Hello World from controller";

	}

    //Get Mapping with a path variable and return a message
   @GetMapping("/customWelcome/{name}")
    public String customWelcome(@PathVariable String name)
    {
        return "Hello" +name +"Welcome!!";
    }
    
    //Get Mapping with a query variable and return a message
   @GetMapping("/customWelcome2")
   public String customWelcome2(@RequestParam("name") String name)
   {
       return "Hello" +name + "Welcome!!";
   }

}
