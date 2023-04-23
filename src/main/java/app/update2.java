package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Employedao;
import dao.EmployedaoImp;
import model.Employee;

@WebServlet("/update2")
public class update2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	Employedao dao;
	public void init() throws ServletException
	{
		dao=new EmployedaoImp();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			int sal=Integer.parseInt(request.getParameter("sal"));
			String dptname=request.getParameter("dptname");
			Employee emp=new Employee(id,name,sal,dptname);
			
			Employee emp1=dao.update2(emp);
			
			System.out.println(" DATA is Update....!!");
			
			request.getRequestDispatcher("display.jsp").forward(request, response);
			

	}

}
