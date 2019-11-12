<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


   


<c:forEach items="${brandList }" var="brand">
	<a href ="${pageContext.request.contextPath }/bhc/bhcPage"><img src="${brand.path }" /></a>
</c:forEach>

   
<br />
<form action = "/brand/brandSubmit">
 <button type = "submit" value="메뉴등록" class="btn btn-primary">메뉴등록</button> 
</form>

<form action = "editBrand">
 <button type = "submit" value="메뉴수정" class="btn btn-warning">메뉴수정</button> 
</form>

<form action = "deleteBrand">
 <button type = "submit" value="메뉴삭제" class="btn btn-danger">메뉴삭제</button> 
</form>