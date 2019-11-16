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
				
				<form action="${pageContext.request.contextPath }/bhc/bhcUpdate">
					<button type="button" class="btn btn-warning"
						onclick="clickUpdateBtn(${b.menu_uid})">메뉴수정</button>
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


	<form action="${pageContext.request.contextPath }/bhc/bhc">
		<input type="submit" class="btn btn-danger" id="js-deleteBtn"
			value="메뉴삭제" />
	</form>



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


	

	
	
	
	
	
	
	
	
/* 	$("#menuCB").click(function() {

		var rowData = new Array();
		var tdArr = new Array();
		var checkbox = $("input[name=user_CheckBox]:checked");

		checkbox.each(function(i) {

			// checkbox.parent() : checkbox의 부모는 <td>이다.
			// checkbox.parent().parent() : <td>의 부모이므로 <tr>이다.
			var tr = checkbox.parent().parent().eq(i);
			var td = tr.children();

			// 체크된 row의 모든 값을 배열에 담는다.
			rowData.push(tr.text());

			// td.eq(0)은 체크박스 이므로  td.eq(1)의 값부터 가져온다.
			var no = td.eq(1).text() + ", "
			var userid = td.eq(2).text() + ", ";
			var name = td.eq(3).text() + ", ";
			var email = td.eq(4).text() + ", ";

			// 가져온 값을 배열에 담는다.
			tdArr.push(no);
			tdArr.push(userid);
			tdArr.push(name);
			tdArr.push(email);

			console.log("no : " + no);
			console.log("userid : " + userid);
			console.log("name : " + name);
			console.log("email : " + email);
		});

		$("#ex3_Result1").html(" * 체크된 Row의 모든 데이터 = " + rowData);
		$("#ex3_Result2").html(tdArr);
	}); */
</script>