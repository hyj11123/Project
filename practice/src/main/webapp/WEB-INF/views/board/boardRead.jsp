<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row">
	<div class="col-md-2"></div>

	<div class="col-md-8">

		<table>
			<c:forEach items="${bList}" var="b">
			
					<tr>
						<td>제목 :</td>
						<td>${b.b_title }</td>
					</tr>

					<tr>
						<td>내용 : </td>
						<td>${b.b_content }</td>
					</tr>

					<tr>
						<td>작성자 :</td>
						<td>${b.b_author }</td>
					</tr>
					
					<button type="button" class="updateBtn" id="updateBtn" name="updateBtn" onclick="clickUpdate(${b.b_uid})">글 수정</button>
					<button type="button" class="deleteBtn" id="deleteBtn" name="deleteBtn" onclick="clickDelete(${b.b_uid})">글 삭제</button>

			</c:forEach>
		</table>

	</div>


	<div class="col-md-2"></div>
</div>

<script>
	function clickDelete(uid){

			var answer = confirm("정말로 지울꺼야?");
			
			if(answer){
				// submit 실행
				location.href = "${pageContext.request.contextPath }/board/deleteBoard?uid=" + uid;
			} else {
				
			}
		
	}
	
	function clickUpdate(uid){
		
		location.href="${pageContext.request.contextPath }/board/input2?uid=" + uid;
	}

</script>

