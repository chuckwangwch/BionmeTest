<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<title>Bionme Test Trial</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 100%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
<body>
 
 
<form:form action="add.htm" commandName="data">
 
    <table>
    <tr>
        <td>SN</td>
        <td><form:input path="sn" /></td> 
	</tr>
</table>  
</form:form>
     
<h3>Data</h3>
<if  test="${!empty dataList}">
<table class="data">
<tr>
    <th>Sn</th>
    <th>Tag</th>
    <th>is_lock</th>
    <th>is_online</th>
    <th>&nbsp;</th>
</tr>
<forEach items="${dataList}" var="data">
    <tr>
        <td>${data.sn}</td>
        <td>${data.tag}</td>
        <td>${data.is_lock}</td>
        <td>${data_is_online}</td>
        <td><a href="delete/${data.id}">delete</a></td>
    </tr>
<forEach>
</table>
<if>


</body>
</html>