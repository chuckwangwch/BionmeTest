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

 
<form:form modelAttribute="meters" action="meters/add.htm" method="POST">
<%-- <form:label path="sn">sn</form:label>
<form:input path="sn"/>
--%>
</form:form>


<%-- <c:if test="${fn:length(meterList) > 0}"> --%>
<h2>Data List</h2>
<table>
<tr class="even">

<th>meter_id</th>
<th>sn</th>
<th>tag</th>
<th>is_lock</th>
<th>is_online</th>
<th>create_date</th>
<th>modify_date</th>
<th>delete_tag</th>

</tr>
<c:forEach var="meter" items="${meterList}">
<tr>
<td><c:out value="${meter.meterId}"/></td>
<td><c:out value="${meter.sn}"/></td>
<td><c:out value="${meter.tag}"/></td>
<td><c:out value="${meter.isLock}"/></td>
<td><c:out value="${meter.isOnline}"/></td>
<td><c:out value="${meter.createDate}"/></td>
<td><c:out value="${meter.modifyDate}"/></td>
<td><c:out value="${meter.deleteTag}"/></td>
</tr>
</c:forEach>
</table>
<%-- </c:if> --%>
</body>

</html>