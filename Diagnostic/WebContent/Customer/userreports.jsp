<%@page import="com.org.TO.ViewReportTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.org.DAO.UsermasterDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>User Reports</title>
</head>

<body>
	<%UsermasterDAO objServices = new UsermasterDAO();
            List<ViewReportTO> lstRep = null;
            String reportId = "";
          /*
           obj1.setReportId(rs.getString("reportId"));
                obj1.setUsername(rs.getString("username"));
                obj1.setEmail(rs.getString("email"));
                obj1.setMobileNo(rs.getString("mobileNo"));
                obj1.setDoctorname(rs.getString("doctorname"));
                obj1.setDiagnosis(rs.getString("diagnosis"));
                obj1.setResult(rs.getString("result"));
                lstRep.add(obj1);
          */
          
            if (request.getParameter("reportId") != null) {
            	reportId = request.getParameter("reportId");
                session.setAttribute("reportId", reportId);
            }
            lstRep = objServices.viewReport(reportId);
            
            pageContext.setAttribute("LIST_REP", lstRep);
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
        <form action="reports.jsp">
        <c:forEach items="${LIST_REP}" var="obj" varStatus="i">
			<table class="centerTable3">
			<tr>
			<td><h3>Report ID: ${obj.reportId}</h3></td>
			</tr>
			<tr>
			<td><h3>Username: ${obj.username}</h3></td>
			</tr>
			<tr>
			<td><h3>Email: ${obj.email}</h3></td>
			</tr>
			<tr>
			<td><h3>Mobile No: ${obj.mobileNo}</h3></td>
			</tr>
			<tr>
			<td><h3>Doctor Name: ${obj.doctorname}</h3></td>
			</tr>
			<tr>
			<td><h3>Diagnosis: ${obj.diagnosis}</h3></td>
			</tr>
			<tr>
			<td><h3>Result: ${obj.result}</h3></td>
			</tr>
			<tr><td>
			<input type="submit" name="back" value="Back">
			</td></td></tr>
			</table>
			
		</c:forEach>
		
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
