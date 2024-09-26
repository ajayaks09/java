<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Login</title>
<style>
div{
padding:30px;
border-radius:30px;
}
input[type="submit"]{
margin-bottom:20px;
}
input{
display:block;
margin-top:20px;
width:90%;
height:30px;
text-align:center;
}
</style>
</head>
<body bgcolor="grey">
<form action="bean.jsp" method="post">
<div style="margin:50px 400px 50px 400px ;background-color:lightblue;color:white">
<center>
<h1>Student Login</h1>
<input type="text" name="name" placeholder="Enter Name" required>
<input type="password" name="pass" placeholder="Enter Password" required>
<input type="date" name="date" placeholder="Date" required >
<input type="text" name="sec" placeholder="Enter Section" required>
<input type="number" name="age" placeholder="Enter Age" required>
<input type="submit">
</center>
</div>
</form>
</body>
</html>