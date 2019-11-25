<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Academic Details</title>
</head>
<body>
<form action="AcademicDetails.nsp" method="post">
<br>     <p><b>Academic details.</b></p>
     
<br><h4> Select your Institute</h4>
<select>
  <option>--Select Institute--</option>
  <option>MIT</option>
  <option>PRMITR</option>
  <option>DMCOE</option>
  <option>YCCE</option>
  </select>

    <br><br><br>

<br>    <label for="Presentclass"><b>Present Class/Course</b></label>
    <input type="text" placeholder="Present class/Course" name="Present class/Course" required>
    
<br><h2> Select your Mode of Learning</h2>
  <select>
  <option>--Select your Mode of Learning--</option>
  <option>Part time</option>
  <option>Full time</option>
  <option>Distance Learning</option>
  
  </select>


    <br><br><br>
    
<br>    <label for="Class_startdate"><b>Class Start Date</b></label>
    <input type="text" placeholder="Class Start Date" name="Class Start Date" required>
    
   
<br>    <label for="University_Board_Name"><b>University Board Name</b></label>
    <input type="text" placeholder="University Board Name" name="University Board Name" required>
    
<br>    <label for="Previousclass"><b>Previous Class/Course</b></label>
    <input type="text" placeholder="Previous Class/Course" name="Previous Class/Course" required>
    
<br>    <label for="Previouspassingyear"><b>Previous Passing Year</b></label>
    <input type="text" placeholder="Previous Passing Year" name="Previous Passing Year" required>

<br>    <p><b>Fee Details.</b></p>
    
<br>    <label for="admissionfee"><b>Admission Fee</b></label>
    <input type="text" placeholder="Admission Fee" name="Admission Fee" required>
    
<br>    <label for="Tuitionfee"><b>Tuition Fee</b></label>
    <input type="text" placeholder="Tuition Fee" name="Tuition Fee" required>
    
<br>    <label for="Otherfee"><b>Other Fee</b></label>
    <input type="text" placeholder="Other Fee" name="Other Fee" required>
 
<br><br>    
<button name="Next" onclick="submit">Upload Documents</button>
<button name="Previous" onclick="StudentMarks_10">Previous</button>
<button name="Cancel">Cancel</button>
<input type="text" id="studentId" name="studentId" value="${sessionScope.studentId}" hidden/> 
</form>    
</body>
</html>