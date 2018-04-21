<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <!--  <link rel="stylesheet" type="text/css" href="/MojCSS.css">-->
 <spring:url value="/recources/MojCSS.css" var="izgled"/>
 <link rel="stylesheet" href="${izgled}" type="text/css">
</head>
<body>
<h2>ovo je za popunjavanje forme</h2>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Employee</h1>  
       <form:form method="post" action="/SpringMVC_JDBC_Simple_CRUD/save" modelAttribute="emp" >    
        <table class="tabela" >    
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"/></td>  
          <td><form:errors path="name" cssClass="greska"/></td>
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
           <td><form:errors path="salary" cssClass="greska"/></td>
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="upisi" /></td>    
         </tr>    
        </table>    
       </form:form>    
</body>
</html>