<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Institute Portal - National Scholarship Program</title>

	<Style>
		.ViewStudentApplicationForm{
			max-width:30%; 
			min-height: 40%;
			border-style:solid;
			position: fixed;
			top:20%;
			left:1%;
		}

		.ApplicationForms{
			position: fixed;
			top:20%;
			right:40%;
			border-style: solid;
			min-width: 40%;
			max-width: 40%;
			min-height: 50%;
			max-height: 50%;
		}

		.StudentForm{
			position: fixed;
			top:20%;
			right:5%;
			border-style: solid;
			min-width: 30%;
			max-width: 30%;
			min-height: 27%;
			/*max-height: 30%;*/
			padding-top: 2%;
			padding-bottom: 2%
		}


	</Style>
</head>
<body>
	<div>
<CENTER><h1>Welcome ${instituteName}</h1></CENTER>
</div>

<br>

<div id="ViewStudentApplicationForm" class="ViewStudentApplicationForm" >
Institute Name
<br>
View Student Application Form
</div>

<div id="ApplicationForms" class="ApplicationForms">
	All Application Forms can be seen here
</div>


<div id="StudentForm" class="StudentForm">
	<center>
	Student ID - ${studentId}
	<br>Caste - ${studentCaste}
	<br>Income - ${studentIncome}
	<br>Gender - ${gender}
	<br>10th Marks - ${Marks10}
	<br>12th Marks - ${Marks12}
	<br>Previous Year marks - ${PreviousMarks}
	<br>Scheme Applied For - ${scheme}
	<br><br>
	<button>Accept</button>
	<button>Reject</button>	
	</center>
</div>

</body>
</html>