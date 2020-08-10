<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	crossorigin="anonymous">

<style>
.row {
	margin-top: 50px;
	margin-bottom: 50px;
}

.masthead-text {
	height: 300px;
}

.form-control {
	height: 45px;
}

.login-or {
	position: relative;
	font-size: 18px;
	color: #aaa;
	margin-top: 20px;
	margin-bottom: 20px;
	padding-top: 10px;
	padding-bottom: 10px;
}

.span-or {
	display: block;
	position: absolute;
	left: 50%;
	top: -2px;
	margin-left: -25px;
	background-color: #fff;
	width: 50px;
	text-align: center;
}

.hr-or {
	background-color: #cdcdcd;
	height: 1px;
	margin-top: 0px !important;
	margin-bottom: 0px !important;
}

#login-dp {
	min-width: 250px;
	padding: 14px 14px 0;
	overflow: hidden;
	background-color: rgba(255, 255, 255, .8);
}

#login-dp .help-block {
	font-size: 12px
}

#login-dp .social-buttons {
	margin: 12px 0
}

#login-dp .social-buttons a {
	width: 49%;
}

#login-dp .form-group {
	margin-bottom: 10px;
}

.btn-fb {
	color: #fff;
	background-color: #3b5998;
}

.btn-fb:hover {
	color: #fff;
	background-color: #496ebc
}

.btn-tw {
	color: #fff;
	background-color: #55acee;
}

.btn-tw:hover {
	color: #fff;
	background-color: #59b5fa;
}

@media ( max-width :768px) {
	#login-dp {
		background-color: inherit;
		color: #fff;
	}
	#login-dp .bottom {
		background-color: inherit;
		border-top: 0 none;
	}
}

body {
	font-family: 'Lato', sans-serif;
}

.progress {
	height: 5px;
}

.form-horizontal {
	padding: 25px 20px;
	border: 1px solid #eee;
	border-radius: 5px;
}

.modal {
	text-align: center;
	padding: 0 !important;
}

.modal:before {
	content: '';
	display: inline-block;
	height: 100%;
	vertical-align: middle;
	margin-right: -4px;
}

.modal-dialog {
	display: inline-block;
	text-align: left;
	vertical-align: middle;
}

.divider {
	position: absolute;
	height: 2px;
	border: 1px solid #eee;
	width: 100%;
	top: 10px;
	z-index: -5;
}

.ex-account {
	position: relative;
}

.ex-account p {
	background-color: rgba(255, 255, 255, 0.41);
}

select:hover {
	color: #444645;
	background: #ddd;
}

.block-help {
	font-weight: 300;
}

.mar-top-bot-50 {
	margin-top: 50px;
	margin-bottom: 50px;
}

.hide {
	display: none;
}
</style>

<div class="container">
	<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-5">
			<div class="card cardbox">
				<center>
					<div class="card-header">
						<b>Save Info Of A Country</b>
					</div>
				</center>
				<div class="card-body">

					<div class="form-group">
						<form action="register.odc" method="post" role="form" class="form"
							accept-charset="UTF-8">
							<div class="form-group">
								<label class="sr-only">Email</label> <input type="email"
									id="countryEmail" name="countryEmail" class="form-control" value=""
									placeholder="Enter Email">
							</div>
							<div class="form-group">
								<label class="sr-only">Country Name</label> <input type="text"
									id="countryName" name="countryName" class="form-control"
									value="" placeholder="Enter Country Name">
							</div>
							<div class="form-group">
								<label class="sr-only">Population</label> <input type="text"
									id="countryPopulation" name="countryPopulation" class="form-control" value=""
									placeholder="Enter Population">
							</div>
							<div class="form-group">
								<label class="sr-only">Continent</label> <select id="countryContinent"
									class="form-control" name="countryContinent">
									<option selected>Select Continent</option>
									<c:forEach var="selist" items="${selist}">
										<option value="${selist.countryname}">${selist.countryname}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group">
								<label class="sr-only">Capital</label> <input type="text"
									id="countryCapital" name="countryCapital" class="form-control" value=""
									placeholder="Enter Capital">
							</div>
							<div class="form-group">
								<button id="submit" name="submit" value="1"
									class="btn btn-block btn-primary">Save User</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>