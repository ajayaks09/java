<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit data</title>
<style>
div {
	padding: 30px;
	border-radius: 30px;
	color: green;
}

input[type="submit"] {
	margin-bottom: 20px;
}

input {
	display: block;
	margin-top: 20px;
	width: 90%;
	height: 30px;
	text-align: center;
	color: green;
}
</style>
</head>
<body bgcolor="grey">
	<%@page import="studentDetails.DAO,studentDetails.get,java.util.*"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%
	int id = Integer.parseInt(request.getParameter("id"));
	List<get> list = DAO.edit(id);
	request.setAttribute("list", list);
	%>
	<div
		style="margin: 50px 400px 50px 400px; background-color: lightblue; color: white">
		<center>
			<form action="UpdateEdit.jsp" method="post">
				<c:forEach items="${list}" var="u">
					<h1 style="color: blue">edit your data</h1>
					<input type="number" value="${u.getId()}" name="id" readonly>
					<input type="text" value="${u.getName()}" placeholder="Name"
						name="name">
					<input type="text" value="${u.getPass()}" placeholder="Password"
						name="pass">
					<input type="text" value="${u.getDate()}" placeholder="Date"
						name="date">
					<input type="text" value="${u.getSec()}" placeholder="Section"
						name="sec">
					<input type="number" value="${u.getAge()}" placeholder="Age"
						name="age">
					<input type="submit" style="background-color: green; color: white">
				</c:forEach>
			</form>
		</center>
	</div>
</body>
</html>
