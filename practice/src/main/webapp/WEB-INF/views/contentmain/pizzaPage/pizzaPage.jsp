<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<c:forEach items="${pizzaList }" var="pizza">

	<a href ="${pageContext.request.contextPath }/pizza/pizzaPage"><img src="${pizza.path }"/> </a>
	
	
</c:forEach>

<br  />

<form action = "/pizza/pizzaSubmit">
 <button type = "submit" value = "피자 등록" class = "btn btn-primary"> 피자등록 </button>
</form>
    