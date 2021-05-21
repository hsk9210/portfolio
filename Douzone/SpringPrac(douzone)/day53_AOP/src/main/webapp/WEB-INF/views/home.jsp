<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<% 
	int sum = 0; 
	for (int i=1;i<=100;i++){
		sum+=i;		
	}
%>
<div>
	<p>1부터 100까지의 합은 <%=sum %> 이다.</p>
</div>

</body>
</html>
