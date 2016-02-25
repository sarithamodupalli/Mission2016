<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<title>Debit Card</title>
<body>
<form:form action ="savesummarydetails.htm" modelAttribute="accountSummaryModel">

		<label>Account Number:</label>
		<form:input path="accountNumber" />
		<br><br>

		<label>Account ype:</label>
		<form:input path="accountType" />
		<br><br>

		<label>Balance:</label>
		<form:input path="balance" />
		<br><br>
		
		<input type="submit" value="Submit" />
		</form:form>
</body>
</html>