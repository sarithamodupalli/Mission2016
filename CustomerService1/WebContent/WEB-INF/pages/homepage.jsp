<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Home Page</title>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/home.js"></script>
</head>
<body id = "homepagebody">
	<h1>WELLS FARGO</h1>
	<form:form name="myform" action="savecreditissue.htm">
	
	<input type="button" value="Home">
	<input type="button" value="About Us">
	<input type="button" value="Online Banking">
	<input type="button" value="Loans And Credit">
	<input type="button" value="Personal">
	<input type="button" value="Business">
	<input type="button" value="Services">
	<input type="button" value="Contact Us"><br><br><br>
	<input type="button" onclick="logIssue()" value="Submit Issue"><br><br><br>
	<input type="button" onclick="getListOfIssues()" value="List Of Issues"><br><br><br>
	<input type="button" onclick="creditCardIssues()" value="Credit Card Issues"><br><br><br>
	<input type="button" onclick="accountSummary()" value="Account Summary"><br><br><br>
	
	 </form:form> 
</body>
</html>