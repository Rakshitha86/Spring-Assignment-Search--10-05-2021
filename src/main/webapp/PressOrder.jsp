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
	background-color: lime;
	display: flex;
	justify-content: space-between;
}

.div {
	width: 100px;
	height: 100px;
	padding-left: 20px;
	padding-top: 10px;
}

body {
	background-color: aqua;
}

.center-screen {
	margin-top: 20px;
	align-items: center;
	width: 250px;
	padding: 20px;
	background-color: pink;
	background-origin: 2px solid purple;
	position: absolute;
	left: 40%;
	top: 10%;
	border: 5px solid solid;
	box-shadow: 1px 7px 6px 5px rgb(255, 0, 76);
	border: 5px solid solid;
	height: 420px;
	align-items: center;
}

.center-screen>div {
	padding: 2px;
}

input, select, textarea {
	height: 30px;
	width: 200px;
	border-radius: 5px;
	text-align: center;
	font-size: 15px;
	margin-bottom: 5px;
}

input, select, textarea::placeholder {
	text-align: center;
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

form {
	display: inline;
}

footer {
	height: 30px;
	background-color: lime;
	text-align: center;
	padding-top: 15px;
	margin-top: 550px;
}
</style>
</head>
<body>
	<nav style="background-color: lime;" class=" navbar navbar-light">
		<a class="navbar-brand">X-Workz</a> <a class="navbar-brand"
			class="float-right" href="#">About</a>
	</nav>
	<!--  <header>
		<div class="div">X-workz</div>
		<div class="div">
			<a href="#">About</a>
		</div>
	</header>-->
	<form action="order.do" method="post">

		<div class="center-screen">

			<h1
				style="font-size: 40px; color: purple; text-align: center; margin-top: 2px;">Order
				Here</h1>

			<div>
				<input type="text" name="orderForm" placeholder="Enter name">
			</div>
			<div>
				<input type="number" name="noOfCopies"
					placeholder="Enter no of copies">
			</div>
			<div>
				<input type="number" name="phoneNo" placeholder="Enter phone no">
			</div>

			<div>
				<select name="cardType">
					<option>CardType</option>
					<option>Marriage</option>
					<option>Birthday</option>
					<option>NamingCeremony</option>
					<option>HouseWarming</option>
					<option>Anniversary</option>
				</select>
			</div>
			<div>
				<textarea rows="20" cols="40" name="content">write here</textarea>
			</div>

			<div>
				<button class="submit" type="submit">Order</button>
				<button class="submit" type="reset">Reset</button>
			</div>
			<div>
				<a href="OrderSearch.jsp">Search</a>
			</div>
			<div>
				<a href="DisplayAll.jsp">SearchAll</a>
			</div>
		</div>
		<!-- <footer> All Right Reserved &copy; Xworkz 2021 </footer> -->

	</form>

	<footer style="background-color: lime;"
		class="page-footer font-small black">
		<div class="footer-copyright text-center py-3">All Right
			Reserved &copy; Xworkz 2021</div>
	</footer>
</body>
</html>