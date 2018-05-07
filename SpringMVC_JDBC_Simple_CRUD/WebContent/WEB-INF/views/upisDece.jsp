<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
ne znam sto nece
<form:form action="/SpringMVC_JDBC_Simple_CRUD/upisiDete"  modelAttribute="dete"  method="POST"> 

  <form:input path="imeDeteta" /> 
 <form:select path="Id">
        <form:options items="${list}" itemValue="Id" itemLabel="name" />
    </form:select> 
    
    <%--  <input type="text" name="imeDeteta"/> 
     <select name="ime">
     <c:forEach items="${list}" var="emp">
     <option>${emp.name}</option>
     </c:forEach>
     </select> --%>
    
    
   
<input type="submit" value="Posalji">

 </form:form>  
</body>
</html>