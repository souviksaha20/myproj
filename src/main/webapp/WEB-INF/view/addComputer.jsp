<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<%@include file="header.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <c:url var="addCoputer" value="addCoputer"></c:url>
   <form:form commandName="comp" method="POST" action="addCoputer">
       <center><table style="background:white">
           <tr><td><form:label path="name">Enter computer name :</form:label></td>
               <td><form:input path="name"/></td>
               <td><form:errors path="name"></form:errors></td>
           </tr>
            
           <tr><td><form:label path="cost">Product cost :</form:label></td>
               <td><form:input path="cost"/></td>
              <td><form:errors path="cost"></form:errors></td>
           </tr>
           <tr><td><form:label path="description">Description</form:label></td>
               <td><form:input path="description"/></td>
              <td><form:errors path="description"></form:errors></td>
           </tr>
           <tr><td><form:label path="quantity">quantity</form:label></td>
               <td><form:input path="quantity"/></td>
              <td><form:errors path="quantity"></form:errors></td>
           </tr>
           <tr><td><form:label path="images" >File upload</form:label></td>
               <td><form:input path="images" name="image" type="file"/></td>
           </tr>         
         
         
          
   <center>       <tr>
               <td><input type="submit" value="Add"/></td>
           </tr></center>          
       </table></center>
   </form:form> 
   <br>
 <!--  <a href="list">Click here to See All Product</a>-->
<%@include file="footer.jsp"%>
</body>
</html>