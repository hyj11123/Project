<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<c:forEach items="${bList }" var="b">
	<div>
		${b.name }
		${b.price }
		${b.spicy }
	</div>
	
<hr>
</c:forEach>

<br /><br /><br /><br />

  

  <button type="button" class="btn btn-primary" id="js-addBtn"> 메뉴 등록 </button>
  
  <button type="button" class="btn btn-warning" id="js-updateBtn">메뉴수정</button>
  
  <button type="button" class="btn btn-danger" id= "js-deleteBtn"> 메뉴 삭제 </button>
  
  
  
  
  
  
  
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