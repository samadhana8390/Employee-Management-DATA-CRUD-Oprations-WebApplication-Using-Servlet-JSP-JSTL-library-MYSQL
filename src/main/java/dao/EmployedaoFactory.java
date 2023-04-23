package dao;

public class EmployedaoFactory 
{
	public static Employedao getInstanse()
	{
		return new EmployedaoImp(); 
	}
	
}
