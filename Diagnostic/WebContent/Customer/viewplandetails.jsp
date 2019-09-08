<%@page import="com.org.TO.HealthPlanTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.org.DAO.UsermasterDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Plan Details</title>
<style>
a:link, a:visited { 
    color: black;
    text-decoration: none;
    cursor: auto;
}
</style>
</head>

<body>
	<%UsermasterDAO objServices = new UsermasterDAO();
            List<HealthPlanTO> lstPlan = null;
            int planId = 0;
          //System.out.println(request.getParameter("serviceId"));
          
            if (request.getParameter("planId") != null) {
            	planId = Integer.parseInt(request.getParameter("planId"));
                session.setAttribute("planId", planId);
            } else {
            	planId = (Integer) session.getAttribute("planId");
            }
           
            lstPlan = objServices.getPlanDetailsById(Integer.parseInt(request.getParameter("planId")));
            
            pageContext.setAttribute("LIST_PLAN", lstPlan);
        %>
	<div id="page">
		<h1 style="font-size: 500%">Diagnostic Medicare</h1>
		<div style="text-align: right">
			<a href="../LogoutServlet">Logout</a>
		</div>
		<div id="header">
			<ul>
				<li><a href="homepage.jsp">Home</a>
				</li>
				<li><a href="services.jsp">Services</a>
				</li>
				<li><a href="healthplans.jsp">Checkup</a>
				</li>
				<li><a href="agents.jsp">Medical Insurance</a>
				</li>
				<li><a href="reports.jsp">My Report</a>
			</ul>

		</div>
		<div class="dotted_line"></div>
		
		<div>
		<form action="healthplans.jsp">
		<c:forEach items="${LIST_PLAN}" var="obj" varStatus="i">
		<table cellpadding="5" cellspacing="10" class="centerTable3">
			<tr>
			<td><h1>Name:	${obj.planName}</h1></td>
			</tr>
			<tr>
			<td><h1>Details:	${obj.planDetails}</h1></td>
			</tr>
			<tr>
			<td><h1>Checkup Duration:	${obj.planDays}</h1></td>
			</tr>
			<tr>
			<td><h1>Price:	${obj.price}</h1></td>
			</tr>
			<tr><td>
		<button type="button" name="Apply"><a href="apply.jsp?planName=${obj.planName}">Apply</a></button>
		<input type="submit" value="Back">
		</td></tr>
		</c:forEach>
		
		</table>
		</form>
		</div>

		<div id="footer">
			<div class="dotted_line"></div>
			<p>
				<a href="http://www.cognizant.com">cognizant 2016</a>
			</p>
		</div>

	</div>
</body>
</html>
