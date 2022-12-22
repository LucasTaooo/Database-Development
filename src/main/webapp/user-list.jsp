<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Customer Heart Disease Prescreening</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
			<nav class="navbar navbar-light" 
			style="background-color: #e3f2fd">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> Customer Heart Disease Prescreening </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Users</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New User</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>ID</th>
						<th>ExamDate</th>
						<th>CustLastName</th>
						<th>CustFirstName</th>
						<th>CustSuffix</th>
						<th>CustDOB</th>
						<th>Age</th>
						<th>Sex</th>
						<th>Chestpain_type</th>
						<th>Resting_blood_pressure</th>
						<th>Chol</th>
						<th>Max_heart_rt</th>
						<th>Exer_agina</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="user" items="${listUser}">
						<tr>
							<td><c:out value="${user.id}" /></td>
							<td><c:out value="${user.examdate}" /></td>
							<td><c:out value="${user.custlastname}" /></td>
							<td><c:out value="${user.custfirstname}" /></td>
							<td><c:out value="${user.custsuffix}" /></td>
							<td><c:out value="${user.custdob}" /></td>
							<td><c:out value="${user.age}" /></td>
							<td><c:out value="${user.sex}" /></td>
							<td><c:out value="${user.chestpain_type}" /></td>
							<td><c:out value="${user.resting_blood_pressure}" /></td>
							<td><c:out value="${user.chol}" /></td>
							<td><c:out value="${user.max_heart_rt}" /></td>
							<td><c:out value="${user.exer_agina}" /></td>
							
							<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
