<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<%@ page import="studentDetails.DAO"%>
<jsp:useBean id="update" class="studentDetails.get"></jsp:useBean>
<jsp:setProperty property="*" name="update"/>
<%  
int i=DAO.Update(update);  
if(i>0){  
out.print("<body bgcolor='lightgreen'><center><h1 style='color:blue'>Updated successfully!!</h1></center></body>");
}else{  
	out.print("<body bgcolor='lightgreen'><center><h1 style='color:Red'>The Record Not Updated!!</h1></center></body>");
}  
%>
</body>
</html>