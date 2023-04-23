package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	
	private int id;
	private String name;
	private int sal;
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", dptname=" + dptname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDptname() {
		return dptname;
	}
	public void setDptname(String dptname) {
		this.dptname = dptname;
	}
	public Employee(int id, String name, int sal, String dptname) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dptname = dptname;
	}
	private  String dptname;
		
}
