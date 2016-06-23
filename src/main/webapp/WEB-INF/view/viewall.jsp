<!DOCTYPE html>
<html lang="en"  >
<head>
</head>
<%@include file="header.jsp"%>
<body ng-app="myApp">
    <div class="container">

        
            <div class="box"  ng-controller="customersCtrl">

                <table class="table">
               <tr>
                <th>Product Name</th>
                <th>Product Cost</th>
                <th>Product Description</th>
                <th>Product Quantity</th>
                <th>Edit/Delete</th>
                 </tr>
               </thead>
               <tbody> 
              <div >
               
               <tr ng-repeat="x in names">
                <td>{{x.name}}</td>
                <td>{{x.cost}}</td>
                <td>{{x.description}}</td>
                <td>{{x.quantity}}</td>
                 <td><a href="viewproduct?id={{x.id}}">view</a>/<a href="edit2?id{{c.id}}">Edit</a>/<a href="delete?id={{x.id}}">delete</a></td>               
                </tr>
                </tbody>
               </table>

               
          </div>
        
         </div>
         <!-- /.container -->
<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope,$http) {
	$http.get("list")
    .then(function (response) {$scope.names = response.data});
    
});
</script>       

         
<%@include file="footer.jsp"%>          
</body>