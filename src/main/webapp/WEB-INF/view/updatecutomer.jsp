<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer</title>
</head>
<body>


<form:form action="savecustomer" method="get" modelAttribute="customer"  >
          
          <form:hidden path="customerId"/>
          
            <table>
                <tr>
                    <td colspan="2" align="center"><h2>Update Customer</h2></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><form:input path="firstName" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><form:input path="lastName" /></td>
                </tr>
                <tr>
                    <td>E-mail:</td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Update" /></td>
                </tr>
            </table>
        </form:form>








</body>
</html>