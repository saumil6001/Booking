
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>CustomerList</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />


</head>
<body>


	<div id="wrapper">
		<div id="header">

			<h2>CUSTOMERS</h2>

		</div>

	</div>


	<div id="container">
		<div id="content">


			<input type="button" value="Add Customer"
				onclick="window.location.href='addcustomer'">


			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>update</th>

				</tr>


				<c:forEach var="cust" items="${customer}">
					<tr>
						<td>${cust.firstName}</td>
						<td>${cust.lastName}</td>
						<td>${cust.email}</td>
						<td>
							<form action="update" method="get"> 
							<button name="update" type="submit" value="${cust.customerId}">UPDATE</button>
							</form>

						</td>

					</tr>
				</c:forEach>
			</table>



		</div>
	</div>





</body>
</html>