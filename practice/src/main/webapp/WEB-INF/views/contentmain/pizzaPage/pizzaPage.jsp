<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<c:forEach items="${pizzaList }" var="pizza">

	<a href ="${pageContext.request.contextPath }/pizza/pizzaPage">${pizza.name }</a>
	<div>${pizza.price }</div>
	<div>${pizza.spicy }</div>
	<div>${pizza.review }</div>
	
</c:forEach>
    