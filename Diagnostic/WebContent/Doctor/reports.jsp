<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Reports</title>
</head>

<body>

    <div id="page">
		<h1 style="font-size: 500%">Diagnostic Medicare</h1>
		<div style="text-align: right"><a href="../LogoutServlet">Logout</a></div>
        <div id="header">
            <ul>
           	   	<li><a href="homepage.jsp">Home</a></li>
                <li><a href="reports.jsp">Patient Reports</a>
            </ul>
            
        </div>
  <div class="dotted_line"></div>
        <div id="main">
        
        	<div class="tab-content">
					<table class="centerTable4">
					<form action="ReportServlet" method="post">
					<tr><td align="left">
                        <label id ="lblMsg" style="color: blue">
                                <c:if test="${param.msg ne null}">
                                    <c:out value="${param.msg}"/>
                                </c:if>
                        </label>
                    </td></tr>
					<tr><td>Report Id</td><td><input type="text" name="reportId" pattern="[A-Za-z]{1}[0-9]{1}" maxlength=2 required autocomplete="off"/></td></tr>
					<tr><td></td><td><input type="submit" name="sbtnVR" value="View Report"/></td></tr>
					</form>
					</table>
			</div>
           
            
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
