<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
.even {
background-color: silver;
}
</style>
<title>Registration Page</title>
</head>
<body>

<form:form action="add.htm" commandName="user">
<table>
<tr>
<td>User Name :</td>
<td><form:input path="name" /></td>
<tr>
</table>
</form:form>
<c:if test="${fn:length(meterList) > 0}">
<table cellpadding="5">
<tr class="even">

<th>sn</th>
</tr>
<c:forEach items="${meterList}" var="meter" varStatus="status">
<tr class="<c:if test="${status.count % 2 == 0}">even</c:if>">
<td>${meter.name}</td>
</tr>
</c:forEach>
</table>
</c:if>
</body>

</html>