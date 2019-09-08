

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1//EN" "http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Sign Up</title>
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
			<div id="login_form">
				<div class="form">
					<div class="tab-content">
						<div id="signup">
							<table>
							<%
								String msg = (String)request.getAttribute("msg");
								if(msg != null && !msg.isEmpty()){ %>
									<p style="text-align: center;"><%= msg %></p>
								<% }
							%>
							<tr><td></td><td><h1>Sign Up</h1></td></tr>

							<form action="SignupController" method="post">
                              
                              
						<tr>		<div class="top-row">
									<div class="field-wrap">
										<label><td> Username</td> </label><td> <input
											type="text" name="username" maxlength=10 placeholder="username" required autocomplete="off" /></td>
									</div></tr>

								<tr>	<div class="field-wrap">
										<label> <td>Password</td> </label> <td><input
											type="password" name="password" required autocomplete="off" /></td>
									</div>
								</tr>

							<tr>	<div class="field-wrap">
									<label> <td>DOB</td>  </label> <td><input
										type="date" name="dateofbirth" required autocomplete="off" /></td>
								</div></tr>

							<tr>	<div class="field-wrap">
									<label><td>Email Address</td> </label><td> <input
										type="email" name="email" pattern="[A-Za-z]{5,10}[@]{1}[A-Za-z]{5}[.]{1}(com)" title="wrong format" placeholder="xyz@abc.com" required autocomplete="off" /></td>
								</div></tr>

							<tr><td></td><td>	<button type="submit" class="button button-block" name="getstarted" />
								Get Started
								</button>
								<input type="reset" value="Reset"/>
								</td></tr>
								
                               </table>
                               </form>
                               <table><tr><td>
									<h2>Already a user? <a href="login.jsp">Login</a></h2>
								</td></tr>
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
