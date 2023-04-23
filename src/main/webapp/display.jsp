<%@page import="java.util.List"%>
<%@page import="dao.EmployedaoFactory"%>
<%@page import="dao.Employedao"%>
<%@page import="util.EmployeFactory"%>
<%@page import="model.Employee"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #ddd;
}

tr:hover {background-color: #00ff00;}

h3{
	color:black;
	
	text-align: center;
}
body {

	background-color: #00ffff;
}
</style>

<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<br>
	<h3>
	<center><h1> ----------------------- EMPLOYEE DATA -------------------------</h1></center>
	</h3>
	<br>
	<br>


	<%!Employedao dao;%>
	<%
		dao = EmployedaoFactory.getInstanse();	
		List list=dao.display();
	%>
	<%
	application.setAttribute("list", list);
	%>
	<div class="container">
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
				<th>DptName</th>
				<th>DELETE</th>
				<th>UPDATE</th>
			</tr>

			<c:forEach var="st" items="${applicationScope.list }">
				<tr>
					<td><c:out value="${st.id}"></c:out></td>
					<td><c:out value="${st.name}"></c:out></td>
					<td><c:out value="${st.sal}"></c:out></td>
					<td><c:out value="${st.dptname}"></c:out></td>
					<td><a
						href="${pageContext.request.contextPath}/deleteData?id=${st.id}">DELETE</a></td>
					<td><a
						href="${pageContext.request.contextPath}/updateData?id=${st.id}">UPDATE</a></td>
				</tr>
			</c:forEach>
			<tr><center><td><button><a href="index.html">ADD</a></button></td></center>
			</tr>
		</table>

	</div>


</body>
</html>