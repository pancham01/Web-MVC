package learning.spring.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.spring.mvc.model.Employee;

@Controller
public class EmployeeController {

	Map<Integer, Employee> map = new HashMap<>();
	
	int i=0;

	@RequestMapping("/")
	public String greetings() {
		System.out.println("MyController.greetings()");
		return "employee-form";
	}

//	@PostMapping("/saveEmp")
//	public String formData(@RequestParam(value = "id")int id,@RequestParam(value = "name")String name,@RequestParam("department")String department,@RequestParam("age") int age ,Model model)
//	{
//		System.out.println("MyController.formData");
//		
//		Employee employee = new Employee(id,name, department, age);
//		
//		map.put(employee.getId(), employee);
//		
//		
//		model.addAttribute("emp", employee);
//		
//		
//		return "employee-profile";
//	}

	
	
	
	@PostMapping("/saveEmp")
	public String formData(@ModelAttribute Employee employee ,Model model)
	{
		System.out.println("MyController.formData");
		
		employee.setId(++i);
		
		map.put(employee.getId(), employee);
		
		model.addAttribute("emp", employee);
		
		
		return "employee-profile";
	}
	
	
	@GetMapping("/getEmp/{id}")
	public String getEmpById(@PathVariable("id") int id,Model model)
	{
		
		
		Employee employee = map.get(id);
		
		model.addAttribute("emp", employee);
		
		return "employee-profile";
	}

}
