<!--

<section id="mainContent">

	<div class="row">

		<div class="col-sm-offset-2 col-sm-8">

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Log In</h3>
				</div>
				<div class="panel-body">
				<c:url var="welcome" value="welcome"></c:url>
             <form:form commandName="welcome" method="POST" action="welcome" enctype="multipart/form-data">
				<div class="form-group">
					<form:label>UserId Or EmailId</form:label>
					<form:input type="text"/>
					</div>
                       
                       <div class="form-group">
							<label for="password">password</label> 
							<form:input type="password"class="form-control" name="password"/>
						</div>
                       
   					       <div class="form-group">
							<input type="submit" class="btn btn-primary btn-md" value="Login">
							&#160;<a href="#">Forgot Password</a>
						</div>


					</form:form>
				</div>
			</div>

		</div>

	</div>
</section>

-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="h" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page For Security</title>
<style>
.errorblock {
 color: #ff0000;
 background-color: #ffEEEE;
 border: 3px solid #ff0000;
 padding: 8px;
 margin: 16px;
}
</style>
</head>
<body onload='document.f.j_username.focus();'>
 <h3>Login with Username and Password (Custom Login Page)</h3>
 
 <h:if test="${not empty error}">
  <div class="errorblock">
   Your login attempt was not successful, try again.<br /> Caused :
   ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
  </div>
 </h:if>
 
 <form name='f' action="<h:url value='j_spring_security_check' />"  method='POST'>
 
  <table>
   <tr>
    <td>User:</td>
    <td><input type='text' name='j_username' value=''>
    </td>
   </tr>
   <tr>
    <td>Password:</td>
    <td><input type='password' name='j_password' />
    </td>
   </tr>
   <tr>
    <td colspan='2'><input name="submit" type="submit"
     value="submit" />
    </td>
   </tr>
   <tr>
    <td colspan='2'><input name="reset" type="reset" />
    </td>
   </tr>
  </table>
 
 </form>
</body>
</html>
