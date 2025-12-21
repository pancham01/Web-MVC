package learning.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import learning.mvc.model.Employee;

@Repository
public class EmployeeDao {


	@Autowired
	private final HibernateTemplate hibernateTemplate;
	
	public EmployeeDao(HibernateTemplate hibernateTemplate)
	{
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public void saveEmp(Employee employee)
	{
		System.out.println("EmployeeDao.saveEmpDao()");
		hibernateTemplate.save(employee);
	}
	
	
}
