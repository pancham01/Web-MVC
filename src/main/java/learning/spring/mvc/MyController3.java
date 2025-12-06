package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/electronics")
public class MyController3 {
	
	@RequestMapping
	public String greetings()
	{
		System.out.println("MyController.greetings()");
		return "electronics-home";
	}
	

	
	
	@RequestMapping(value = {"/admin"})
	public String admin()
	{
		System.out.println("MyController.admin()");
		return "admin";
	}
}
