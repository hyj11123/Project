<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


   

<form action = "${pageContext.request.contextPath }/brand/updateBrand">
<c:forEach items="${elist }" var="e">
	NAME : <input type = "text" name ="name" value = "${e.name }"/>
    
    TYPE : <input type = "text"name ="type" value=  "${e.type }"/>
    PATH : <input type="text" name = "path"> <br />
    
    
    <input type="text" name ="brand_uid" value = "${e.brand_uid }">
</c:forEach>
    <input type ="submit" value="수정1">
</form>
    
    
    	