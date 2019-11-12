<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<div class="col-md-1"></div>
	<div class="col-md-6">
		<h1>아이디 : ${login_id }</h1>
		<br> <br> 이름 : ${login_name}<br> <br> 비밀번호 :
		${login_password }<br> <br> 이메일 : ${login_email}<br> <br>
		집번호 : ${login_zip_code}<br> <br> 주소 : ${login_add}<br>
		<br> 상세 주소 : ${login_detail_add}<br> <br>
		
		<a class="navbar-brand" href="${pageContext.request.contextPath }/update/updatePage">
			<button type="button" class="btn btn-warning" id="revise">수정</button>
		</a>

		<form id="frm1" action="${pageContext.request.contextPath }/delete/deleteJoin" class = "form-horizontal">
			<input type="hidden" name="member_uid" value="${login_member_uid }" />
			<input type="button" class="btn btn-danger" id="delete" value="회원탈퇴" onclick="deleteClick()"/>
		</form>



	</div>
	<div class="col-md-5"></div>
</div>

<script>

function deleteClick(){
	var answer = confirm("정말로 지울꺼야?");
	
	if(answer){
		// submit 실행
		$("#frm1").submit();
	} else {
		// 아무것도 안하면 돼
	}
}

</script>
















