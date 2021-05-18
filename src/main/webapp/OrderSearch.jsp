<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style type="text/css">
input {
	height: 30px;
	width: 200px;
	border-radius: 5px;
	text-align: center;
	font-size: 15px;
	margin-bottom: 5px;
}

.submit {
	background-color: rgb(43, 176, 228);
	height: 39px;
	width: 209px;
	border-radius: 5px;
	font-size: 20px;
	color: maroon;
	margin-bottom: 5px;
}
</style>
</head>
<body style="background-color: aqua;">
	<nav style="background-color: lime;" class=" navbar navbar-light">
		<a class="navbar-brand">X-Workz</a> <a class="navbar-brand"
			class="float-right" href="#">About</a>
	</nav>

	<form action="search.do" method="get">
		<pre> 
	<input type="text" name="orderForm" placeholder="Search by Order Form">
	<button type="submit">Order</button>
	<button type="reset" style="margin-top: 5px;">Reset</button>
		</pre>
	</form>
	<h1>${message1}</h1>
	<h1>${message2}</h1>

	Search From ${data.orderForm}
	</br> NO Of Copies ${data.noOfCopies}
	</br> Phone No ${data.phoneNo}
	</br> Card Type ${data.cardType}
	</br> Content ${data.content}
	</br>

	<footer style="background-color: lime;"
		class="page-footer font-small black">
		<div class="footer-copyright text-center py-3">All Right
			Reserved &copy; Xworkz 2021</div>
	</footer>
</body>
</html>