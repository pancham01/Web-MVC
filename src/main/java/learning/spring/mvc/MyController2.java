package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	
	@RequestMapping
	public String greetings()
	{
		System.out.println("MyController2.greetings()");
		return "welcome";
	}
	

	
	
	@RequestMapping(value = {"/admin"})
	public String admin()
	{
		System.out.println("MyController.admin()");
		return "admin";
	}
}
