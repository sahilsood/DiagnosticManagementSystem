
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Login</title>

</head>

<body>
	<div id="page">

		<h1 style="font-size: 500%">Diagnostic Medicare</h1>
		


        <div id="header">
            <ul>
           	   	<li><a href="index.jsp">Home</a></li>
               	<li><a href="registration.jsp">Customers</a></li>
                <li><a href="login.jsp">Doctor</a></li>
                <li><a href="aboutus.jsp">About Us</a></li>
                <li><a href="contactus.jsp">Contact Us</a></li>
            </ul>
            
        </div>
		</div>
		<div class="dotted_line"></div>
		<div id="main">
			<div id="login_form" >
				<div class="form">
					<div class="tab-content">
						<div id="signup">
						<table>
						<tr>
                    <td align="left">
                        <label id ="lblMsg" style="color: red">
                                <c:if test="${param.msg ne null}">
                                    <c:out value="${param.msg}"/>
                                </c:if>
                        </label>
                    </td>
                </tr>
						<tr><td>
							<h1>Login</h1>
						</td></tr>
							<form action="AuthServlet" method="post">
							<div id="error"></div>
						<tr><td>	Username:</td><td> <input type="text"  name="txtUsername"/></br></td></tr>
							<tr><td> Password: </td><td> <input type="password" name="txtPassword"/></br></td></tr>
							<tr><td><input type="submit" name="sbtnLogin" value="Login"></td></tr>
							</form>
							</table>
						</div>
					</div>
				</div>


			 <div id="footer">
        <div class="dotted_line"></div>
        <p>
        <a href="http://www.cognizant.com">cognizant 2016</a></p>
      </div>

			</div>
			</div>
</body>
</html>
