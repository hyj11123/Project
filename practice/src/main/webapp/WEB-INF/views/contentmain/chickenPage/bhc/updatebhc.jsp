<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="${pageContext.request.contextPath }/bhc/bhcUpdate">

	<input type="text" name="name"> <br /> 
	<input type="text" name="price"> <br /> 
	<input type="text" name="spicy"> <br /> 
	<input type="text" name="review"> <br /> 
	<input type="hidden" name="brand_uid" value="4"> <br /> 
	<input type="submit" value="메뉴 수정" />
</form>