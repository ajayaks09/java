<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Users</title>
</head>
<body bgcolor="green">

	<%@page import="studentDetails.DAO,studentDetails.get,java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h1>Users List</h1>

	<%
	List<get> list = DAO.Records();
	request.setAttribute("list", list);
	%>

	<table border="1" width="90%">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Password</th>
			<th>Date</th>
			<th>Section</th>
			<th>Age</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getName()}</td>
				<td>${u.getPass()}</td>
				<td>${u.getDate()}</td>
				<td>${u.getSec()}</td>
				<td>${u.getAge()}</td>
				<td><a href="edit.jsp?id=${u.getId()}">Edit</a></td>
				<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="Home.jsp">Add New User</a>
</body>
</html>
