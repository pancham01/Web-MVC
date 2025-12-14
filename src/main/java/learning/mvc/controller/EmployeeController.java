package learning.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.mvc.model.Employee;

@Controller
public class EmployeeController {

	static Map<Integer, Employee> map = new HashMap<>();

	int i = 5;

	static {
		map.put(1, new Employee(1, "Guest1", "CS", 30));
		map.put(2, new Employee(2, "Guest2", "IT", 30));
		map.put(3, new Employee(3, "Guest3", "IOT", 30));
		map.put(4, new Employee(4, "Guest4", "CS", 30));
		map.put(5, new Employee(5, "Guest5", "AI", 30));
	}

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
	public String formData(@ModelAttribute Employee employee, Model model) {
		System.out.println("MyController.formData");

		employee.setId(++i);

		map.put(employee.getId(), employee);

		model.addAttribute("emp", employee);

		return "employee-profile";
	}

	@GetMapping("/getEmp/{id}")
	public String getEmpById(@PathVariable("id") int id, Model model) {

		Employee employee = map.get(id);

		model.addAttribute("emp", employee);

		return "employee-profile";
	}

}
