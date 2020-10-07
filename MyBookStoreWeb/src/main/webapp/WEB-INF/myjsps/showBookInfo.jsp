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
		<table class="table table-srtiped table-bordered table-light myfont">
			<tr>
				<th>Book Id</th>
				<td>${MyBookInfo.bookId}</td>
			</tr>
			<tr>
				<th>Book Name</th>
				<td>${MyBookInfo.bookName}</td>
			</tr>
			<tr>
				<th>Author</th>
				<td>${MyBookInfo.author}</td>
			</tr>
			<tr>
				<th>Publications</th>
				<td>${MyBookInfo.publications}</td>
			</tr>
			<tr>
				<th>Category</th>
				<td>${MyBookInfo.category}</td>
			</tr>
			<tr>
				<th>Price</th>
				<td>${MyBookInfo.price}</td>
			</tr>
			<tr>
				<th>Offer</th>
				<td><span class="mytext-large btn-danger">${MyBookInfo.offer}%Off</span></td>
			</tr>
			<tr>
				<th>Ratings</th>
				<td>${MyBookInfo.avgRating}</td>
			</tr>
		</table>

	</div>
	<div class="container" align="center">
		<h1 class="text-center">
			<a href="continueShopping" class="btn btn-danger">Continue
				Shopping</a>
		</h1>
	</div>
	<br />
	<c:import url="myfooter.jsp" />
</body>
</html>