<%@page import="com.org.TO.HealthPlanTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.org.DAO.UsermasterDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Apply</title>
<style>
a:link, a:visited { 
    color: black;
    text-decoration: none;
    cursor: auto;
}
</style>
</head>

<body>
    <div id="page">
		<h1 style="font-size: 500%">Diagnostic Medicare</h1>
		<div style="text-align: right"><a href="../LogoutServlet">Logout</a></div>
        <div id="header">
            <ul>
           	   	<li><a href="homepage.jsp">Home</a></li>
               	<li><a href="services.jsp">Services</a></li>
               	<li><a href="healthplans.jsp">Checkup</a></li>
                <li><a href="agents.jsp">Medical Insurance</a></li>
                <li><a href="reports.jsp">My Report</a>
            </ul>
            
        </div>
  <div class="dotted_line"></div>
        <div id="main">
        
       <form action="CheckupController" method="post">
		<table>
		<%
			String msg = (String)request.getAttribute("msg");
			if(msg != null && !msg.isEmpty()){ %>
				<p style="text-align: center;"><%= msg %></p>
			<% }
		%>
		<tr><td></td><td><h3><u>HEALTH CHECKUP APPLICATION FORM</u></h3></td></tr>
		<br>
		<tr><td></td></tr>
		<tr><td></td></tr>
		<tr><td></td></tr>
		<tr><td>Username</td><td><input type="text" pattern="[A-Za-z0-9]{2,10}" placeholder="username" title="only characters allowed" name="username"/></td>
		<tr><td>DOB</td><td><input type="date"  name="dob" /></td></tr>
		
		<tr><td>Email</td><td><input type="text" pattern="[A-Za-z0-9]{5,20}[@]{1}[A-Za-z]{5}[.]{1}(com)" title="wrong format" placeholder="Ex: xyz@abc.com" name="email"/></td></tr>
		<tr><td>Country</td><td><select name="country"><option vale="India">India</option></select></td></tr>
		<tr><td>State</td><td><select name="state"><option vale="Uttar Pradesh">Uttar Pradesh</option>
		<option value="Gujarat">Gujarat</option></select></td></tr>
		<tr><td>City</td><td><input type="text" pattern="[A-Za-z]{7,10}" placeholder="Ex: Chennai" title="only characters allowed" name="city"/></td></tr>
		<tr><td>Pincode</td><td><input type="text" pattern="[0-9]{6}" minlength=6 maxlength=6 title="only digits allowed" placeholder="Ex: 641114" name="pincode"/></td></tr>
		<tr><td>Health Plan</td><td><input type="text" name="plan" value="<%= request.getParameter("planName") %>"/></td></tr>
		
		<tr><td></td><td> <input type="submit" value="Submit"/>
		<input type="reset" value="Reset"/>
		<button type="button" name="back"><a href="healthplans.jsp">Back</a></button></td></tr>
		</table>
		</form>
            
           	<div class="main_bottom"></div>
            
        </div>
        
        
        
        <div id="footer">
        <div class="dotted_line"></div>
        <p>
        <a href="http://www.cognizant.com">cognizant 2016</a></p>
      </div>
        
        </div>
</body>
</html>
