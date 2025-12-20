package learning.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import learning.mvc.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@RequestMapping("/")
	public String greetings() {
		System.out.println("MyController.greetings()");
		return "employee-form";
	}

	@PostMapping("/saveEmp")
	public String formData(@ModelAttribute Employee employee, Model model) {
		System.out.println("MyController.formData");

		hibernateTemplate.save(employee);

		model.addAttribute("emp", employee);

		return "employee-profile";
	}

	@GetMapping("/getEmp/{id}")
	public String getEmpById(@PathVariable("id") int id, Model model) {

//		model.addAttribute("emp", hibernateTemplate.load(Employee.class, id));

		return "employee-profile";
	}

}
