<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<form action="/bhc/bhcSubmit">

	<input type="text" name="name"> <br /> 
	<input type="text" name="price"> <br /> 
	<input type="text" name="spicy"> <br /> 
	<input type="text" name="review"> <br /> 
	<input type="hidden" name="brand_uid" value="4"> <br /> 
	<input type="submit" value="메뉴 등록" />
</form>