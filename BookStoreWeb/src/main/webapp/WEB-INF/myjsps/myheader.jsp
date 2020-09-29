<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="UTF-8">
<title>JLC Bookstore</title>
<script src="webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar nvbar-expand-lb navbar-dark bg-dark sticky-top">
		<h4>
			<a href="/" class="navbar-brand">JLC Book Store</a>
		</h4>
		<button class="navbar-togler" type="button" data-toggle="collapse"
			data-target="#navbarColor01" aria-controls="navbarColor01"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarColor01" align="right">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-1">
				<li class="nav-item active">
					<h4>
						<a href="/showRatingsForm" class="nav-link">Rate the books</a>
					</h4>
				</li>
				<li class="nav-item active">
					<h4>
						<a href="/showMyRatings" class="nav-link">Show My Ratings</a>
					</h4>
				</li>
				<li class="nav-item active">
					<h4>
						<a href="/mylogin" class="nav-link">Login</a>
					</h4>
				</li>
				<li class="nav-item active">
					<h4>
						<a href="/myregister" class="nav-link">Register</a>
					</h4>
				</li>
			</ul>
		</div>
	</nav>
</body>
</html>