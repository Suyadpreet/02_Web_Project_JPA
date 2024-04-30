<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="books">
	Book ID : <input type = "text" name = "id"/><br>
	<input type = "submit" value = "Search"/>
</form>
<br><br><br><br>
<h1>${msg}</h1>
Book Id : ${book.bookId}<br>
Book Name : ${book.bookName}<br>
Book Price : ${book.price}
</body>
</html>