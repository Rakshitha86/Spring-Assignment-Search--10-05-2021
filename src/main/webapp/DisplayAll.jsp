<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>For each tag</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
</head>
<body style="background-color: aqua;">
	<sql:setDataSource var="myDS" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/pressorder" user="root"
		password="root123" />

	<sql:query var="data" dataSource="${myDS}">
        SELECT * FROM details;
    </sql:query>
	<nav style="background-color: lime;" class=" navbar navbar-light">
		<a class="navbar-brand">X-Workz</a> <a class="navbar-brand"
			class="float-right" href="#">About</a>
	</nav>
	<form action="" displarAll.do" method="post">
		<h1>${message1}</h1>
		<h1>${message2}</h1>
		<table style="width: 100%" ;border="1" ; bordercolor="purple"
			; align="center">
			<h1>List of Press Order</h1>
			<thead>
				<tr>
					<th>Id</th>
					<th>OrderForm</th>
					<th>NoOfCopies</th>
					<th>PhoneNo</th>
					<th>CardType</th>
					<th>Content</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${data.rows}">
					<tr>
						<th><c:out value="${dto.id}" /></th>
						<th><c:out value="${dto.orderForm}" /></th>
						<th><c:out value="${dto.noOfCopies}" /></th>
						<th><c:out value="${dto.phoneNo}" /></th>
						<th><c:out value="${dto.cardType}" /></th>
						<th><c:out value="${dto.content}" /></th>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
	<footer style="background-color: lime;"
		class="page-footer font-small black">
		<div class="footer-copyright text-center py-3">All Right
			Reserved &copy; Xworkz 2021</div>
	</footer>
</body>
</html>