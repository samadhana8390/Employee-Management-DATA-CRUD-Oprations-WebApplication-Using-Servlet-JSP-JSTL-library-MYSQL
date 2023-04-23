package dao;

import java.util.List;

import model.Employee;

public interface Employedao 
{
	Employee save (Employee emp);
	Employee delete(int id);
	Employee update(int id);
	Employee update2(Employee emp);
	List display();
	

}
