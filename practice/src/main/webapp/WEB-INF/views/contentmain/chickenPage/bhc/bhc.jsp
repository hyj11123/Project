<%@ page language="java" contentType="text/html; charset= UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<c:forEach items="${bList }" var="b">
	<div>
		<table>
			<tr>
				<td>
					<form id="checkForm"
						action="${pageContext.request.contextPath }/bhc/bhcCheck">
						<input type="checkbox" id="menuCB" value="${b.menu_uid}"
							onclick="checkClick()" /><br>
					</form>
				</td>
			</tr>
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
				</div>

			<hr>
		</table>
</c:forEach>

<br />
<br />
<br />
<br />







<button type="button" class="btn btn-primary" id="js-addBtn">
	메뉴 등록</button>

<button type="button" class="btn btn-warning" id="js-updateBtn">메뉴수정</button>

<form action="${pageContext.request.contextPath }/bhc/bhc">
	<input type="submit" class="btn btn-danger" id="js-deleteBtn"
		value="메뉴삭제" />
</form>







<script>
	const addBtn = document.getElementById("js-addBtn");

	function next() {
		location.href = "/bhc/insertMenu";
	}

	addBtn.addEventListener("click", next);

	//----------------------------------------------------------------

	const updateBtn = document.getElementById("js-updateBtn");

	function next2() {
		location.href = "/bhc/updatebhc";
	}
	updateBtn.addEventListener("click", next2);

	//----------------------------------------------------------------

	
	
	var rowData = new Array();
	var tdArr = new Array();
	var checkbox = $("input[name=user_CheckBox]:checked");

	const checkBtn = docuement.getElementById("menuCB")
	
	checkBtn.addEventListener("click", checkClick);
	
	function checkClick() {
		if (checkBtn == ${b.menu_uid}) {
			$("#checkForm").submit();
			console.log("no : " + no);
			console.log("")
		} else {

			{

			}
		}
	}

</script>