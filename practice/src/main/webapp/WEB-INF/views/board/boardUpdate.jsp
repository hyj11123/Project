<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="row">

	<div class="col-md-2"></div>


	<div class="col-md-8">
		<form action="${pageContext.request.contextPath }/board/clickUpdate">
			<table>
				<c:forEach items="${bList }" var="b">
					<tr>
						<td>제목 : <input type="text" id="title" name="title"
							value="${b.b_title }" /></td>
					</tr>

					<tr>
						<td>내용 : <input type="text" id="content" name="content"
							value="${b.b_content }" /></td>
					</tr>
					<tr>
						<td><input type="hidden" id="uid" name="uid"
							value="${b.b_uid }" /></td>
					</tr>
					<tr>
						<td><input type="submit" id="update" name="name"
							onclick="clickUpdate(${b.b_uid})" value="수정" /></td>
					</tr>
				</c:forEach>
			</table>
		</form>


	</div>


	<div class="col-md-2"></div>


</div>

