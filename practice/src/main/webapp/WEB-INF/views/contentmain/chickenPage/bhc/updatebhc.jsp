<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="${pageContext.request.contextPath }/bhc/bhcUpdate">

	<c:forEach items="${aList }" var="a">



	
	NAME : <input type="text" name="name" value="${a.name }">
		<br /> 
	
	PRICE : <input type="text" name="price" value="${a.price}">
		<br /> 
	
	SPICY : <input type="text" name="spicy" value="${a.spicy} ">
		<br /> 
	
	REVIEW<input type="text" name="review" value="${a.review }">
		<br />
		<input type="hidden" name="menu_uid" value="${a.menu_uid }">
		<input type="hidden" name="brand_uid" value="${a.brand_uid }">
		<br />

		<input type="submit" value="메뉴 수정" />
	</c:forEach>
</form>