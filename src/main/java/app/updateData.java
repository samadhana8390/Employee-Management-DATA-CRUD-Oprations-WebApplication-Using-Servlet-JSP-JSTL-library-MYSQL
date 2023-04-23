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
@WebServlet("/updateData")
public class updateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Employedao dao;
	public void init() throws ServletException
	{
		dao=new EmployedaoImp();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		
		out.print(id);
		
		
	
		Employee emp= dao.update(id);
		
		request.setAttribute("emp", emp);
		request.getRequestDispatcher("update.jsp").forward(request,response);
		
		
	}

}
