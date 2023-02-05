<html>
	<body>
	
		<h1>Estas en menu</h1>
		${nombre}
		<br>
		${password}
		
		<%
        if(request.getParameter("usuario").equals("jalil")){%>
        	Bienvenido
        <%}%>
    	
	</body>
</html>