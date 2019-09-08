
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../style.css" />
<title>Agents</title>
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
        
        	<form action="AgentServlet" method="post">
		<center>
		<table class="centerTable4">
		<br>
		<tr><td></td></tr>
		<tr><td></td></tr>
		<tr><td></td></tr>
		<tr><td><h1></>Location</h1></td><td>
		<select name="city"><option value="Choose a Location">Choose a Location</option>
		<option value="Chennai">Chennai</option>
		<option value="Bangalore">Bangalore</option>
		<option value="Kerala">Kerala</option></select></td></tr>
			
			<tr><td></td><td><input type="submit" name="sbtnAG" value="submit"/>
		</center>
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
