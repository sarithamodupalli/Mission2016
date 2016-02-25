<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
	<form:form modelAttribute="debitCardModel" action="homepage.htm" >
		<h1>Debit Card Issues</h1>

		<table style="width: 100%">
			<tr>
				<td>Debit Card Id</td>
				<td>Issue Type</td>
				<td>Issue Descp</td>
			</tr>
			 <c:forEach items="${list}" var="debitCardModel"> 
				<tr>
					<td>${debitCardModel.accountId}</td>
					<td>${debitCardModel.issueType}</td>
					<td>${debitCardModel.issueDesc}</td>
				</tr>
			 </c:forEach> 
		</table>
		<input type="submit" value="Home Page"><br><br>
	</form:form>
</body>
</html>