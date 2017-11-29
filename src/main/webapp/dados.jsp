<html>
<head>
<title>App 02</title>
</head>
<body>
	<h1>Informações</h1>
	Servidor:
	<b> <%=request.getServerName()%></b>
	<br> Porta Servidor:
	<b> <%=request.getServerPort()%></b>
	<br> IP:
	<b> <%=request.getRemoteAddr()%></b>
	<br> Porta Cliente:
	<b><br> <%=request.getRemotePort()%></b>
	<br>
</body>
</html>