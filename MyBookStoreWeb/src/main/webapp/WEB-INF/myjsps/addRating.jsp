<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="UTF-8">
<title>JLC Bookstore</title>
<link href="webjars/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<link href="mycss/bookstore.css" rel="stylesheet">
</head>
<body>
	<div class="card">
		<c:import url="myheader.jsp" />
	</div>
	<div class="container">
		<form:form action="/addMyRating" modelAttribute="myUserRating">
			<table class="table table-striped table-bordered table-light myfont">
				<tr>
					<th colspan="2" align="center">Provide Your Rating</th>
				</tr>
				<tr>
					<th>User ID</th>
					<td> <form:input path="userId" readonly="true"/></td>
				</tr>
				<tr>
					<th>Book ID</th>
					<td><form:input path="bookId"/></td>
				</tr>
				<tr>
					<th>Rating</th>
					<td><form:input path="rating"/></td>
				</tr>
				<tr>
					<th>Review</th>
					<td><form:textarea path="review"/></td>
				</tr>
				<tr>
					<th colspan="2" align="center">
						<input class="btn btn-primary" type="submit" value="Add Rating Info">
					</th>
				</tr>
			</table>
		
		</form:form>

	</div>
	<br/><br/><br/><br/>
	<c:import url="myfooter.jsp" />
</body>
</html>