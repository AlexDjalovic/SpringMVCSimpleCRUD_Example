<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%--   <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <!--<link rel="stylesheet" type="text/css" href="/MojCSS.css">-->
 <spring:url value="/recources/MojCSS2.css" var="izgled"/>
 <link rel="stylesheet" href="${izgled}">
</head>
<body>
   --%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="zaglavlja/header.jsp"/>

<h1>Edit Employee</h1>
<form:form method="POST" action="/SpringMVC_CRUD_Header_Footer/editsave">
	<table class="tabela">
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>Salary :</td>
			<td><form:input path="salary" /></td>
		</tr>
		<tr>
			<td>Designation :</td>
			<td><form:input path="designation" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Sacuvaj Promenu" /></td>
		</tr>
	</table>
</form:form>

<jsp:include page="zaglavlja/footer.jsp"/>