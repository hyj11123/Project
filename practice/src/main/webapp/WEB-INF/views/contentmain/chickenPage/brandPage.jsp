<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


   


<c:forEach items="${brandList }" var="brand">
	<a href ="${pageContext.request.contextPath }/bhc/bhcPage"><img src="${brand.path }" /></a>
	<button type = "button" value="브랜드 수정" class="btn btn-warning" onclick="modifiedBrand(${brand.brand_uid})">수정하기 	</button> 
</c:forEach>

   
<br />
<form action = "/brand/brandSubmit">
 <button type = "submit" value="브랜드 등록" class="btn btn-primary">브랜드 등록</button> 
</form>

<form action = "editBrand">
 <button type = "submit" value="브랜드 수정" class="btn btn-warning">브랜드 수정</button> 
</form>

<form action = "deleteBrand">
 <button type = "submit" value="브랜드 삭제" class="btn btn-danger">브랜드 삭제</button> 
</form>

<script>
	function modifiedBrand(uid){
		console.log(uid);
		location.href = "/brand/editBrand?uid=" + uid;
			
	}

</script>