<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="${pageContext.request.contextPath }/bhc/bhcUpdate">

	NAME : <input type="text" name="name"> <br /> 
	PRICE : <input type="text" name="price"> <br /> 
	SPICY : <input type="text" name="spicy"> <br /> 
	REVIEW<input type="text" name="review"> <br /> 
	<input type="hidden" name="brand_uid" value="4"> <br /> 
	<input type="submit" value="메뉴 수정" />
</form>