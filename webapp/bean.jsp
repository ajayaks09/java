<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Values</title>
</head>
<body>
<%@ page errorPage="error.jsp" %>
<%@ page import="studentDetails.DAO"%>
<jsp:useBean id="get" class="studentDetails.get"></jsp:useBean>
<jsp:setProperty property="*" name="get"/>
<%  
int i=DAO.insert(get);  
if(i>0){  
response.sendRedirect("success.jsp");  
}else{  
response.sendRedirect("error.jsp");  
}  
%>  
</body>
</html>