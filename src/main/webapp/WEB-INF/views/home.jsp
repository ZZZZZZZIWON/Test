<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello GitHub!  
	</h1>
	
	<P id="p1">  The time on the server is ${serverTime}. </P>
	<P id="p2">  The time on the server is ${serverTime}. </P>
	<P id="p3">  The time on the server is ${serverTime}. </P>
	
	<c:forEach items="${list }" var="list">
		<div>
			<p>${list.id }</p>
			<p><fmt:formatDate value="${list.date }" pattern="yyyy.MM.dd"/></p>
		</div>
	</c:forEach>
	


	<script>
		document.querySelector('#p1').style.color = 'green';
		document.querySelector('#p2').style.color = '#022D36';
		document.querySelector('#p3').style.fontSize = '50px';
	</script>

</body>
</html>
