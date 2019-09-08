<%@ page import="java.util.*" %>
<%@page import="com.org.TO.AgentTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.org.DAO.UsermasterDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Agent Details</title>
</head>

<body>
	<%UsermasterDAO objServices = new UsermasterDAO();
            List<AgentTO> lstAge = null;
            String city = "";
          
            if (request.getParameter("city") != null) {
            	city = request.getParameter("city");
                session.setAttribute("city", city);
            }
          lstAge = objServices.viewAgent(city);
            pageContext.setAttribute("LIST_AGE", lstAge);
        %>

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
        <form action="agents.jsp">
        
			<table class="centerTable3">
			<tr>
			<c:forEach items="${LIST_AGE}" var="obj" varStatus="loop">
			<td>
			<h3>Agent ID: ${obj.agentId}</h3></br>
			<h3>Agent Name: ${obj.agentName}</h3></br>
			<h3>Street Address: ${obj.streetAddress}</h3></br>
			<h3>Mobile No: ${obj.mobileNo}</h3></br>
			<h3>City: ${obj.city}</h3></br>
			<h3>State: ${obj.state}</h3></br>
			<h3>Zipcode: ${obj.zipcode}</h3></br>
			</td>
			</c:forEach>
			</tr>
			<tr><td>
			<input type="submit" name="back" value="Back">
			</td></td></tr>
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
