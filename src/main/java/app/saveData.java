package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import dao.Employedao;
import dao.EmployedaoImp;
import model.Employee;
import util.EmployeFactory;

@WebServlet("/saveData")
public class saveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Employedao dao;
	public void init() throws ServletException
	{
		dao=new EmployedaoImp();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int sal=Integer.parseInt(request.getParameter("sal"));
		String dptname=request.getParameter("dptname");
		
		Employee emp=new Employee();
		emp.setName(name);
		emp.setSal(sal);
		emp.setDptname(dptname);
		
		dao.save(emp);
		request.getRequestDispatcher("index.html").forward(request, response);

	}

}
