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
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${user != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${user == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${user != null}">
            			Edit User
            		</c:if>
						<c:if test="${user == null}">
            			Add New User
            		</c:if>
					</h2>
				</caption>

				<c:if test="${user != null}">
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
				</c:if>
				
				

				<fieldset class="form-group">
					<label>Exam Date</label> <input type="text"
						value="<c:out value='${user.examdate}' />" class="form-control"
						name="examdate">
				</fieldset>

				<fieldset class="form-group">
					<label>Last Name</label> <input type="text"
						value="<c:out value='${user.custlastname}' />" class="form-control"
						name="custlastname">
				</fieldset>
				
				<fieldset class="form-group">
					<label>First Name</label> <input type="text"
						value="<c:out value='${user.custfirstname}' />" class="form-control"
						name="custfirstname">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Suffix</label> <input type="text"
						value="<c:out value='${user.custsuffix}' />" class="form-control"
						name="custsuffix">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label>Date of birth</label> <input type="text"
						value="<c:out value='${user.custdob}' />" class="form-control"
						name="custdob">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label>Age</label> <input type="text"
						value="<c:out value='${user.age}' />" class="form-control"
						name="age" required="required">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label>User Sex</label> <input type="text"
						value="<c:out value='${user.sex}' />" class="form-control"
						name="sex" required="required">
				</fieldset>


				<fieldset class="form-group">
					<label>User Chestpain_type</label> <input type="text"
						value="<c:out value='${user.chestpain_type}' />" class="form-control"
						name="chestpain_type" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>User Resting_blood_pressure</label> <input type="text"
						value="<c:out value='${user.resting_blood_pressure}' />" class="form-control"
						name="resting_blood_pressure" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>User Chol</label> <input type="text"
						value="<c:out value='${user.chol}' />" class="form-control"
						name="chol" required="required">
				</fieldset>				
				
				<fieldset class="form-group">
					<label>User Max_heart_rt</label> <input type="text"
						value="<c:out value='${user.max_heart_rt}' />" class="form-control"
						name="max_heart_rt" required="required">
				</fieldset>
				
				
				<fieldset class="form-group">
					<label>User Exer_agina</label> <input type="text"
						value="<c:out value='${user.exer_agina}' />" class="form-control"
						name="exer_agina" required="required">
				</fieldset>
						
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
