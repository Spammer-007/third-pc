<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Documents</title>
</head>
<body align="center">
<h1>Upload your Documents</h1>
<form action="DocumentsUpload.nsp" method="post">
<br><br><br>
    <br>    Domicile Certificate 
    <button class="upload1">Upload</button>
    
    <div>
    <br>    Student Photograph
       <button class="upload2">Upload</button>
    </div><div>
    <br>   Institute ID card
    <button class="upload3">Upload</button>
    </div><div>
    <br>    Caste Income Certificate
    <button class="upload4">Upload</button>
    </div><div>
    <br>    Previous Year Marksheet
    <button class="upload5">Upload</button>
    </div><div>
    <br>    Fee Reciept of Current Year
    <button class="upload6">Upload</button>
    </div><div>
    <br>    Bank Passbook(Front Page)
    <button class="upload7">Upload</button>
    </div><div>
    <br>    Aadhar Card
    <button class="upload8">Upload</button>
    </div><div>
    <br>    10th Class Marksheet
    <button class="upload9">Upload</button>
    </div><div>  
    <br>    12th Class Marksheet
    <button class="upload10">Upload</button>
    </div>
    
    <button name="Previous" onclick="StudentMarks_12">Previous</button>
     <button name="Previous" onclick="submit">Previous</button>
<button name="Cancel">Cancel</button>

<input type="text" id="studentId" name="studentId" value="${sessionScope.studentId}" hidden/> 
</form>
</body>
</html>