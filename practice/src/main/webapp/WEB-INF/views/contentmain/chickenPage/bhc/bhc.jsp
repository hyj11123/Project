<%@ page language="java" contentType="text/html; charset= UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>



	<c:forEach items="${bList }" var="b">
		<table>
			<tr>
				<td>번호 : ${b.menu_uid}<br />
				</td>
			</tr>
			<tr>
				<td>이름 : ${b.name }<br />
				</td>
			</tr>
			<tr>
				<td>가격 : ${b.price }<br />
				</td>
			</tr>
			<tr>
				<td>매운정도 : ${b.spicy }<br />
				</td>
			</tr>
			<tr>
				<td>

					<form id="update" action="${pageContext.request.contextPath }/bhc/bhcRead2">
						<button type="submit" class="btn btn-warning"
							onclick="clickUpdateBtn(${b.menu_uid})">메뉴수정</button>
					</form>

					<form action="${pageContext.request.contextPath }/bhc/bhc">
						<input type="submit" class="btn btn-danger" id="js-deleteBtn"
							value="메뉴삭제" />
					</form>


				</td>
			</tr>
			<tr>
				<td>
					<hr>
				</td>
			</tr>
		</table>
	</c:forEach>

	<br />
	<br />
	<br />
	<br />







	<button type="button" class="btn btn-primary" id="js-addBtn">
		메뉴 등록</button>




</body>




<script>
	const addBtn = document.getElementById("js-addBtn");
	
	function clickUpdateBtn(uid){
		console.log(uid);
		
	}
	

	function next() {
		location.href = "/bhc/insertMenu";
	}

	addBtn.addEventListener("click", next);

	//----------------------------------------------------------------


	

	
	
	
	
	
	
	
</script>