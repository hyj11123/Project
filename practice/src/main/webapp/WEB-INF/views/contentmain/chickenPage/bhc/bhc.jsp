<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<c:forEach items="${bList }" var="b">
	<div>
	<input type="checkbox" id="menuCB" /><br>
	이름 : 	${b.name }<br>
	가격 : 	${b.price }<br>
	매운정도 : 	${b.spicy }
	</div>
	
<hr>
</c:forEach>

<br /><br /><br /><br />

  

  <button type="button" class="btn btn-primary" id="js-addBtn"> 메뉴 등록 </button>
  
  <button type="button" class="btn btn-warning" id="js-updateBtn">메뉴수정</button>
  
  <form action="${pageContext.request.contextPath }/bhc/bhc">
  	<input type="submit" class="btn btn-danger" id= "js-deleteBtn" value = "메뉴삭제"/>
  </form>
  
  
  
  
  
  
  
<script>
 	
	const addBtn = document.getElementById("js-addBtn");
	
	function next(){
		location.href = "/bhc/insertMenu"; 	
	}
	
	addBtn.addEventListener("click",next);

//----------------------------------------------------------------

	const updateBtn = document.getElementById("js-updateBtn");
	
	function next2() {
		location.href = "/bhc/updatebhc";		
	}
	updateBtn.addEventListener("click",next2);


</script>