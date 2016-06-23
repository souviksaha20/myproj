<!DOCTYPE html>
<html lang="en">
<head>
<%@include file="header.jsp"%>
</head>

<body>
             
                 <c:url var="addCoputer" value="addCoputer"></c:url>
                    <form:form id="product" modelAttribute="product2" method="POST" action="update?id=${product2.id}">
                     <center><table style="background:white">
                      <tr><td><form:label path="name">Enter computer name :</form:label></td>
                        <td><form:input path="name"/>{product2.name}</td>
                       </tr>
           <tr><td><form:label path="cost">Product cost :</form:label></td>
               <td><form:input path="cost"/>${product.name}</td>
           </tr>
           <tr><td><form:label path="description">Description</form:label></td>
               <td><form:input path="description"/>{product.name}</td>
           </tr>
           <tr><td><form:label path="quantity">quantity</form:label></td>
               <td><form:input path="quantity"/>{product.name}</td>
           </tr>
           <tr><td><form:label path="quantity">quantity</form:label></td>
               <td><form:input path="quantity"/>{product.image}</td>
           </tr>
<center>           <tr><td></td>
               <td><input type="submit" value="Save"/></td>
           </tr>
           
 </center>          
       </table></center>
   </form:form> 
   <br>
                                
    





</body>
</html>

<!-- <!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Form</h1>
    <form action="#" th:action="@{/greeting}" th:object="${greeting}" method="post">
    	<p>Id: <input type="text" th:field="*{id}" /></p>
        <p>Message: <input type="text" th:field="*{content}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
</body>
</html> -->
                