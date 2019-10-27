<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
NAME varchar(20) 
ID varchar(20) 
PASSWORD varchar(50) 
EMAIL varchar(50) 
ZIP_CODE
ADD varchar(250) 
DETAIL_ADD varchar(250) 
 -->

<div class="row">

	<div class="col-md-2"></div>

	<div class="col-md-8">
		<form action="${pageContext.request.contextPath }/signup/userJoin"  class="form-horizontal">
			<!-- NAME -->
			<div class="form-group">
				<label for="inputID" class="control-label">NAME</label> 
				<input type="text" id="name" name="name" class="form-control" placeholder="NAME" />
			</div>
			<!-- ID -->
			<div class="form-group">
				<label for="inputID" class="control-label">ID</label> 
				<input type="text" id="id" name="id" class="form-control" placeholder="ID" />
			</div>
			<!-- PASSWORD1 -->
			<div class="form-group">
				<label for="inputID" class="control-label">PASSWORD</label>
				<input type="password" id="password" name="password" class="form-control" placeholder="PASSWORD"/>
			</div>

			<!-- PASSWORD2 -->
			<div class="form-group">
				<label for="inputID" class="control-label">PASSWORD CHECK</label> 
				<input type="password" id="password_checking" name="password_checking" class="form-control" placeholder="PASSWORD CHECK"/>
			</div>

			<!-- EMAIL -->
			<div class="form-group">
				<label for="inputID" class="control-label">EMAIL</label> 
				<input type="email" id="email" name="email" class="form-control" placeholder="EMAIL"/>
			</div>


			<!-- ADD -->
			<div class="form-group">
				<label for="inputID" class="control-label">주소</label> 
				<input type="text" id="add" name="add" class="form-control" placeholder="ADD" readonly/>
			</div>

			<!-- ZIPCODE -->
			<div class="form-group">
				<label for="inputID" class="control-label">우편번호</label> 
				<input type="text" id="zip_Code" name="zip_Code" class="form-control" placeholder="ZIP_CODE" readonly/> 
				<input type="button" id="zipBtn" value="검색" class="btn btn-warning"/>
			</div>


			<!-- DETAIL_ADD -->
			<div class="form-group">
				<label for="inputID" class="control-label">상세주소</label> 
				<input type="text" id="detail_add" name="detail_add" class="form-control" placeholder="DETAIL_ADD"/>
			</div>

			<div class="form-group">
				<input type="submit" value="JOIN" class="btn btn-warning"/>
			</div>

		</form>

	</div>

	<div class="col-md-2"></div>

</div>






<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

	<script>
		const zipBtn = document.getElementById("zipBtn");
		const Zip_Code = document.getElementById("zip_Code");
		const addInput = document.getElementById("add");
		const detail_add = document.getElementById("detail_add");
	
	
		function callZipcode() {
			new daum.Postcode({
				oncomplete : function(data) {
					
					zip_Code.value = data.zonecode;
					addInput.value = data.address;
					detail_add.focus();
					
				}
			}).open();
		}
		
		
		zipBtn.addEventListener("click", callZipcode);
		
		
	</script>