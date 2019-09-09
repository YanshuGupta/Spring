<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="addProduct" method="post">
		<input type="text" placeholder="Id here" name="id"/>
		<input type="text" placeholder="Name here" name="name"/>
		<input type="text" placeholder="Price here" name="price"/>
		<input type="text" placeholder="Quantity here" name="quantity"/>
		<button type="submit">Add</button>	
	</form>

</body>
</html>