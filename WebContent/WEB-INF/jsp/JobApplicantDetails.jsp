<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Applicant details</title>
</head>
<body>
 <div align="center">
        <h2>Spring MVC Job Application Form</h2>
        <form:form action="#" method="POST" >
        
        <table border="0" width="90%">
        
               
    <tr>
        <td>Name</td>
        <td><form:input path="name"/></td>
    </tr>
    <tr>
        <td>Qualification</td>
        <td><form:input path="qual" /></td>
    </tr>
    
     <tr>
        <td>Experience</td>
        <td><form:input path="exp" /></td>
    </tr>
     <tr>
        <td>Phone number</td>
        <td><form:input path="phn" /></td>
    </tr>
     <tr>
        <td>Email</td>
        <td><form:input path="email" /></td>
    </tr>
    
    
    <tr>
        
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>
</form:form> 
 </div>
</body>
</html>