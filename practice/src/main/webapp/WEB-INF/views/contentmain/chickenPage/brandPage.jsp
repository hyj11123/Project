<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<c:forEach items="${brandList }" var="brand">
	<a href ="${pageContext.request.contextPath }/bhc/bhcPage"><img src="${brand.path }" /></a>
</c:forEach>

   
   
   
   
   
   