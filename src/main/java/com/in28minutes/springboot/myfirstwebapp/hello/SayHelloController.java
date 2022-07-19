package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//"say-hello" => "Hello! What are you learning?"
	//say-hello
	// http://localhost:8080/say-hello
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning?";
	}
	
	
	//"say-hello-jsp" => "say-Hello.jsp"
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	

}
