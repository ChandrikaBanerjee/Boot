<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	test
	
	${employeemongo}
	
	<table>
		<tr>
			<th>Employee ID</th>
			<th>Employee First Name</th>
			<th>Employee Last Name</th>
		</tr>
		<jstl:forEach var="map" items="${employee}">
			<tr>
				<td>${map.get("empId) }</td>
				<td>${map.get("empFirstName") }</td>
					<td>${map.get("empLastName") }</td>
			</tr>
		</jstl:forEach>
	</table>
</body>
</html>