package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController2 {
	
	@GetMapping
	public String greetings()
	{
		System.out.println("MyController2.greetings()");
		return "welcome";
	}
	

	
	
	@RequestMapping(value = {"/admin"})
	public String admin(@RequestParam(name ="username",defaultValue = "Guest")String userName,Model model)
	{
		System.out.println("MyController.admin : "+userName);
		
		model.addAttribute("userName", userName);
		
		return "admin";
	}
}
