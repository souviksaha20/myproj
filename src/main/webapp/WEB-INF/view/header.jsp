<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<!-- spring url for static resources -->
<spring:url value="/resources/css" var="css" />
<spring:url value="/resources/js" var="js" />
<spring:url value="/resources/img" var="img" />




    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Shopping Mood </title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css">



    <!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${css}/business-casual.css" rel="stylesheet">
<!-- jquery -->
<script src="${js}/jquery.min.js"></script>
<script src="${js}/angular.min.js"></script>
    <!-- Fonts -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>



<body>
<div class="brand">Business Casual</div>
    <div class="address-bar">3481 Melrose Place | Beverly Hills, CA 90210 | 123.456.7890</div>

    <!-- Navigation -->
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
            <a href="<c:url value="/index"/>"> Business Casual </a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="<c:url value="/index"/>">Home</a>
                    </li>
                    <li>
                        <a href="<c:url value="/aboutus"/>">About Us</a>
                    </li>
                    <li>
                        <a href="<c:url value="/contactus"/>">Contact US</a>
                    </li>
                    <li>
                        <a href="<c:url value="/login2"/>">Log in</a>
                    </li>
                    <li>
                        <a href="<c:url value="/register"/>">Register</a>
                    </li>
                    <li>
                        <a href="<c:url value="/showForm"/>">Add Product</a>
                    </li>
                    <li>
                        <a href="<c:url value="/viewAll"/>">View All</a>
                    </li>
                    <li>
                    <a href="/logout"> Logout</a>${author}
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

</body>
</html>