<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>



<body>
	<div class="row">
		<div class="col-md-2"></div>

		<div class="col-md-8">
			<form action="${pageContext.request.contextPath }/update/updateJoin" class="form-horizontal">


				<div class="Name">
					<!-- NAME -->
					<label for="inputID" class="control-label">NAME</label><br /> 
					이름 : ${login_name}<br /> 수정할 이름 :
					<div class="form-group">
						<input type="text" id="Name" name="Name" class="form-control" placeholder="NAME" value="${login_name}" />
					</div>
					<br /> <br />
				</div>


				<div class="Password">
					<!-- PASSWORD -->
					<label for="inputID" class="control-label">PASSWORD</label><br />
					비밀번호 : ${login_password }<br /> 수정할 비밀번호 :
					<div class="form-group">
						<input type="password" id="Password" name="Password" class="form-control" placeholder="PASSWORD" value="${login_password}"/>
					</div>
					<br /> <br />
				</div>


				<div class="Email">
					<!-- EMAIL -->
					<label for="inputID" class="control-label">EMAIL</label> <br />
					이메일 : ${login_email}<br /> 수정할 이메일 :
					<div class="form-group">
						<input type="email" id="Email" name="Email" class="form-control" placeholder="EMAIL" value="${login_email}"/>
					</div>
					<br /> <br />
				</div>


				<div class="Add">
					<!-- ADD -->
					<label for="inputID" class="control-label">ADD</label> <br /> 
					주소 : ${login_add}<br /> 수정할 주소 :
					<div class="form-group">
						<input type="text" id="ADD" name="ADD" class="form-control" placeholder="ADD" value="${login_add}"/>
					</div>
					<br /> <br />
				</div>


				<div class="Zip_Code">
					<!-- ZIP_CODE -->
					<label for="inputID" class="control-label">ZIP_CODE</label> <br />
					집번호 : ${login_zip_code}<br /> 수정할 집번호 :
					<div>
						<input type="text" id="Zip_Code" name="Zip_Code" class="form-control" placeholder="ZIP_CODE"  value="${login_zip_code}"/> 
						<input type="button" id="zipBtn" value="검색" class="btn btn-warning" />
					</div>
					<br /> <br />
				</div>


				<div class="Detail_Add">
					<!-- DETAIL_ADD -->
					<label for="inputID" class="control-label">DETAIL_ADD</label> <br />
					상세 주소 : ${login_detail_add}<br /> 수정할 상세주소 :
					<div class="form-group">
						<input type="text" id="Detail_Add" name="Detail_Add" class="form-control" placeholder="DETAIL_ADD" value="${login_detail_add}"/>
					</div>
					
				<input type="hidden" name="member_uid" value="${login_member_uid }" />
					<br /> <br />
				</div>

				<input type="submit" value="수정" class="btn btn-warning">
			</form>
		</div>

		<div class="col-md-2"></div>
	</div>

</body>








<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>
	const zipBtn = document.getElementById("zipBtn");
	const Zip_Code = document.getElementById("Zip_Code");
	const ADD = document.getElementById("ADD");
	const Detail_Add = document.getElementById("Detail_Add");

	function callZipcode() {
		new daum.Postcode({
			oncomplete : function(data) {

				Zip_Code.value = data.zonecode;
				ADD.value = data.address;
				Detail_Add.focus();

			}
		}).open();
	}

	zipBtn.addEventListener("click", callZipcode);
</script>