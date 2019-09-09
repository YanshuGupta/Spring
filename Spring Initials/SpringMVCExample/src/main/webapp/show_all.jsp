<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>Cap's Products</title>
</head>
<body>
<h2 align="center">Products here</h2>
<table align="center">
		<tr>      
	        <td>Id</td>
	        <td>Name</td>
	        <td>Price</td>
	        <td>Quantity</td>
	        <td>Action</td>
	    </tr>
	<c:forEach items="${products}" var="product">
	    <tr>      
	        <td>${product.id}</td>
	        <td>${product.name}</td>
	        <td>${product.price}</td>
	        <td>${product.quantity}</td>  
	        <td><form type="hidden" action="remove/${product.id}" method="post">
	        		<input type="submit" value="Remove"/>
	        	</form>
	        </td>
	    </tr>
	</c:forEach>
</table>
</body>
</html>
