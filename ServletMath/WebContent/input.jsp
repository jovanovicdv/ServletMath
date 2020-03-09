<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<form action="../ServletMath/math" method="post">
		Insert a: <input 
		value=<% if(request.getAttribute("a")==null){%>
		<%="0" %>
	<% }else{ %>
	
	<%=request.getAttribute("a")%><%
	
	}%>
	type="text" id="a" name="a" /> 
		
		
		
		Insert b: <input
		 value=<% if(request.getAttribute("b")==null){%>
		<%="0" %>
	<% }else{ %>
	
	<%=request.getAttribute("b")%><%
	
	}%>
		
		
		
		
		 type="text" id="b" name="b" /> 
		
	
	<h3>
	Result :<%
					if (request.getAttribute("result") != null) {%>
		
		<%=request.getAttribute("result")%>
		<% }
				%>
		</h3>
		
		<h1><%
					if (request.getAttribute("msg") != null) {%>

						<%=request.getAttribute("msg")%>

					<% }
				%></h1>
		<br> <input type="submit" value="add" name="submit"/>
		 <input type="submit" value="minus" name="submit"/>
	</form>

</body>
</html>



