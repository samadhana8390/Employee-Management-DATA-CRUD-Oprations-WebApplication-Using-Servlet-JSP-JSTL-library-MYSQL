package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.Employee;
import util.EmployeFactory;

public class EmployedaoImp implements Employedao
{

	@Override
	public Employee save(Employee emp)
	{
		SessionFactory factory=EmployeFactory.getsessionfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println(" Data is added...!!");
		return emp;
		
	}

	@Override
	public Employee delete(int id) 
	{
		SessionFactory factory=EmployeFactory.getsessionfactory();
		Session session=factory.openSession();
		
		Employee emp=new Employee();
		emp.setId(id);
		Transaction tx=session.beginTransaction();
		session.delete(emp);
		tx.commit();
		System.out.println(" Data is Deleted...!!");
		return emp;
		
	}

	@Override
	public Employee update(int id) 
	{
		SessionFactory factory=EmployeFactory.getsessionfactory();
		Session session=factory.openSession();
		Employee emp=(Employee)session.load(Employee.class, id);
		return emp;
	}

	@Override
	public Employee update2(Employee emp)
	{
		SessionFactory factory=EmployeFactory.getsessionfactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
	
		session.update(emp);
		tx.commit();
		session.close();
		
		return emp;	
	}

	@Override
	public List display() 
	{
		SessionFactory factory=EmployeFactory.getsessionfactory();
		Session session=factory.openSession();
		String sql="from Employee e";
		Query query=session.createQuery(sql);
		List list=query.list();
		
		return list;
	}
}
