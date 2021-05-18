<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style type="text/css">
header {
	height: 40px;
	border: 1px solid black;
	background-color: lime;
	display: flex;
	justify-content: space-between;
}

div {
	width: 100px;
	height: 100px;
	padding-left: 20px;
	padding-top: 10px;
}

body {
	background-color: aqua;
}

footer {
	height: 30px;
	width: 1350px;
	background-color: lime;
	text-align: center;
	padding-top: 15px;
	margin-top: 600px;
}
</style>
</head>
<body>
	<nav style="background-color: lime;" class=" navbar navbar-light">
		<a class="navbar-brand">X-Workz</a> <a class="navbar-brand"
			class="float-right" href="#">About</a>
	</nav>

	<!-- <header>
		<div>X-workz</div>
		<div>
			<a href="#">About</a>
		</div>
	</header> -->
	<h1>${message}</h1>
	<p>
		Order Form ${data.orderForm}</br> NO Of Copies ${data.noOfCopies}</br> Phone No
		${data.phoneNo}</br> Card Type ${data.cardType}</br> Content ${data.content}</br>
	</p>
	<!--<footer>All Right Reserved &copy; Xworkz 2021</footer> -->
	<footer style="background-color: lime;"
		class="page-footer font-small black">
		<div class="footer-copyright text-center py-3">All Right
			Reserved &copy; Xworkz 2021</div>
	</footer>
</body>
</html>