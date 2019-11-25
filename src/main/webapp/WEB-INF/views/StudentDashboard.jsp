<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="ISO-8859-1">
<title>Welcome to National Scholarship Portal</title>

<link rel="stylesheet" type="text/css" href="/css/StudentDashboard_css.css">

</head>

<body>
<center><a href="/"><img src="/images/logo.jpg"/></a></center>
<br><br>
<!-- <div>
<center>
<ul>
<a href="#">HOME</a>
<a href="#">ABOUT US</a>
<a href="#">CONTACT</a>
</ul>
</center>
</div> -->
<div class="center1" style="float: left;">
<form>
<input type="button" value="My Profile"><br><br>
<input type="button" value="Check Status"><br><br>
<input type="button" value="Update"><br><br>
<input type="button" value="My Profile"><br><br>
<input type="button" value="Logout"><br><br>
<br></form>
</div>

<center>

<h1>Student ID = ${ sessionScope.studentId }</h1>

<div class="center" style="float: center;">
<!-- <form action="ScholarshipBasic" method="post">  -->

<b>APPLY FOR SCHOLARSHIP<br><br><br>
<a href="ScholarshipBasic">CLICK HERE</a>
</b>
<!-- </form> -->
<!-- <input type="submit" onclick="ScholarshipBasic" value="POST MATRIC SCHOLARSHIP"/>
	<input type="submit" onclick="ScholarshipBasic" value="SCHOLARSHIP MEANT FOR GIRLS"><br><br>
	<input type="submit" onclick="ScholarshipBasic" value="MERIT BASED SCHOLARSHIP"><br><br>		 -->
	
</div>
</center>

<div class="center2">
   <h4>
  <center><span class="color-change">GUIDELINES</span></h4></center> 
</div>

<div class="main-content-header1">
  <h1>
  <center><span class="color-change"></span></h1></center>
  
</div>

<div align="left">

<center>
<ul>
<b>Scheme Description</b><br><br>
<input type="button" value="Apply"><br>
</ul>
</center>
</div>
</form>



</body>
</html>