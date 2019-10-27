<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
	<h1>아이디 : ${login_id }</h1><br><br>
	
	이름 : ${login_name}<br><br>
	
	비밀번호 : ${login_password }<br><br>

	이메일 : ${login_email}<br><br>
	
	집번호 : ${login_zip_code}<br><br>
	
	주소 : ${login_add}<br><br>
	
	상세 주소 : ${login_detail_add}<br><br>
	<a class="navbar-brand" href="${pageContext.request.contextPath }/update/updatePage">
	<button type="button" class="btn btn-warning" id="revise">수정</button>
	</a>
	