<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-8">
		<c:forEach items="${dList }" var="d">
			<table>
				<tr>
					<td> 번호 : ${d.menu_uid }</td>
				</tr>
				<tr>
					<td> 이름 : ${d.name}</td>
				</tr>
				<tr>	
					<td> 가격 : ${d.price}</td>
				</tr>
				<tr>
					<td> 매운정도 : ${d.spicy }</td>
				</tr>
			</table>
		</c:forEach>
	</div>
	<div class="col-md-2"></div>
</div>



<script>



</script>