<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<title>Debit Card</title>
<body>
<form:form action ="savecreditissue" modelAttribute="creditCardModel">

		<label>CreditCard Id: </label>
		<form:input path="creditCardId" />
		<br><br>

		<label>Issue Type:  </label>
		<form:input path="issueType" />
		<br><br>

		<label>Issue Desc: </label>
		<form:input path="issueDesc" />
		<br><br>
		
		<input type="submit" value="Submit" />
		</form:form>
</body>
</html>