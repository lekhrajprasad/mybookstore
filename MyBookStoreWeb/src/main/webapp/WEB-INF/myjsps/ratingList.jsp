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
		<table class="table table-sriped table-bordered table-light myfont">
			<thead class="bg-info">
				<tr>
					<th>Book ID</th>
					<th>User ID</th>
					<th>Rating</th>
					<th>Review</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="myuserRating" items="${MyUserRatingList}">
					<tr>
						<td>${myuserRating.bookId}</td>
						<td>${myuserRating.userId}</td>
						<td>${myuserRating.rating}</td>
						<td>${myuserRating.review}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<br/><br/><br/><br/>
	<c:import url="myfooter.jsp" />
</body>
</html>