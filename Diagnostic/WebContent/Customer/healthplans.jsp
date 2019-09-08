<%@page import="com.org.TO.HealthPlanTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.org.DAO.UsermasterDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Health Plans</title>
<style type="text/css">

a:link {
    color: red;
}

/* visited link */
a:visited {
    color: blue;
}

</style>

</head>
<body>
	<%UsermasterDAO objServices = new UsermasterDAO();
            List<HealthPlanTO> lstPlan = null;
            lstPlan = objServices.getAllPlans(request.getParameter("planName"));
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
		<table border=1 cellpadding="5" cellspacing="10" class="centerTable5">
		<tr>
		<c:forEach items="${LIST_PLAN}" var="obj" varStatus="i">
			
			<td height="370"><a href="viewplandetails.jsp?planId=${obj.planId}"><h1>${obj.planName}</h1></a></td>
			
		</c:forEach>
		</tr>
		</table>

		<div id="footer">
			<div class="dotted_line"></div>
			<p>
				<a href="http://www.cognizant.com">cognizant 2016</a>
			</p>
		</div>

	</div>
</body>
</html>
