package learning.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import learning.spring.mvc.model.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/")
	public String greetings()
	{
		System.out.println("MyController.greetings()");
		return "employee-form";
	}
	
	
	@PostMapping("/getEmp")
	public String formData(@RequestParam(value = "name")String name,@RequestParam("department")String department,@RequestParam("age") int age ,Model model)
	{
		System.out.println("MyController.formData");
		
		Employee employee = new Employee(name, department, age);
		
		model.addAttribute("emp", employee);
		
		
		return "employee-profile";
	}
	

}
