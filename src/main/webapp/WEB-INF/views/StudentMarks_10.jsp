<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter 10th Marks</title>
</head>
<body align="center">
<form action="StudentMarks10.nsp" method="post">
<br>    <p><b>10th Class.</b></p>
    
<br>    <label for="Student10ID"><b>Roll Number</b></label>
    <input type="text" placeholder="Roll Number" name="Roll Number" required>
    
<br>    <label for="BoardName"><b>Board</b></label>
    <input type="text" placeholder="Board" name="Board" required>
    
<br>    <label for="passingYear"><b>Passing Year</b></label>
    <input type="text" placeholder="passing year" name="passing year" required>
    
<br>    <label for="Percentage"><b>% Obtained</b></label>
    <input type="text" placeholder="% Obtained" name="%Obtained" required>
    
<br><br>    
<button name="Next" onclick="submit">Next</button>
<button name="Previous" onclick="AcademicDetails">Previous</button>
<button name="Cancel">Cancel</button>

<input type="text" id="studentId" name="studentId" value="${sessionScope.studentId}" hidden/> 
</form>    
</body>
</html>