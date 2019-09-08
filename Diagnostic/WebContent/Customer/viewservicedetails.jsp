<%@page import="com.org.TO.ServicesTO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.org.DAO.UsermasterDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Service Details</title>
</head>

<body>
	<%UsermasterDAO objServices = new UsermasterDAO();
            List<ServicesTO> lstServ = null;
            int serviceId = 0;
          //System.out.println(request.getParameter("serviceId"));
          
            if (request.getParameter("serviceId") != null) {
            	serviceId = Integer.parseInt(request.getParameter("serviceId"));
                session.setAttribute("serviceId", serviceId);
            } else {
            	serviceId = (Integer) session.getAttribute("serviceId");
            }
           
            	lstServ = objServices.getServiceDetailsById(Integer.parseInt(request.getParameter("serviceId")));
            
            pageContext.setAttribute("LIST_SERV", lstServ);
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
		<form action="services.jsp">
		<c:forEach items="${LIST_SERV}" var="obj" varStatus="i">
		<table cellpadding="5" cellspacing="10" class="centerTable">
		<tr><td><h1>${obj.serviceName}</h1></td></tr>
		<tr><td><img src="../Images/labi.jpg" /></td></tr>
			<tr>
			<td><h1>Features:	${obj.serviceFeatures}</h1></td>
			</tr>
			<tr>
			<td><h1>Benefits:	${obj.serviceBenefits}</h1></td>
			</tr>
			<tr>
			<td><h1> Parameters:	${obj.serviceParameters}</h1></td>
			</tr>
		</c:forEach>
		<tr><td><input type="submit" name="back" value="back"></td></tr>
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
