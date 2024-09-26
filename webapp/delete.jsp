<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="studentDetails.DAO" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
int result=DAO.delete(id);
if(result>0){
	out.print("success");

}
else{
	out.print("error");
}
%>

</body>
</html>