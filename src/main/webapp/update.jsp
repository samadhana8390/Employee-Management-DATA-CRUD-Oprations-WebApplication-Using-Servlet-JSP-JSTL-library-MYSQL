<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	</table>
	<center>
		<h1>---------------- Update Data ----------------</h1>
		<table>
			<form action="update2" method="get">
				<tr>
					<td>Id :</td>
					<td><input type="text" name="id" placeholder="id" value="${requestScope.emp.id}"readonly="readonly"></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name" placeholder="name"value="${requestScope.emp.name}"></td>
				</tr>
				<tr>
				<td>Salary :</td>
				<td><input type="text" name="sal" placeholder="sal"value="${requestScope.emp.sal}"></td>
			</tr>
			<tr>
				<td>dptName :</td>
				<td><input type="text" name="dptname" placeholder="dptname"value="${requestScope.emp.dptname}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="update"></td>
				<td><input type="reset" value="reset"></td>
			</tr>

			</form>
			</center>
		</table>
</body>
</html>