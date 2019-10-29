<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<link rel="stylesheet" href="css/user.css" />


<body>
<div class="row">
	<div class="col-md-2"></div>

	<div class="col-md-8">
		<div class="Id">
			<!-- ID -->
			<label for="inputID" class="control-label">ID</label><br /> 아이디 :
			${login_id }<br /> 수정할 아이디 :
			<div class="form-group">
				<input type="text" id="id" name="id" class="form-control"
					placeholder="ID" />
			</div>
			<br />
			<br />
		</div>


		<div class="Name">
			<!-- NAME -->
			<label for="inputID" class="control-label">NAME</label><br /> 이름 :
			${login_name}<br /> 수정할 이름 :
			<div class="form-group">
				<input type="text" id="name" name="name" class="form-control"
					placeholder="NAME" />
			</div>
			<br />
			<br />
		</div>


		<div class="Password">
			<!-- PASSWORD -->
			<label for="inputID" class="control-label">PASSWORD</label><br />
			비밀번호 : ${login_password }<br /> 수정할 비밀번호 :
			<div class="form-group">
				<input type="password" id="password" name="password"
					class="form-control" placeholder="PASSWORD" />
			</div>
			<br />
			<br />
		</div>


		<div class="Email">
			<!-- EMAIL -->
			<label for="inputID" class="control-label">EMAIL</label> <br /> 이메일
			: ${login_email}<br /> 수정할 이메일 :
			<div class="form-group">
				<input type="email" id="email" name="email" class="form-control"
					placeholder="EMAIL" />
			</div>
			<br />
			<br />
		</div>


		<div class="Add">
			<!-- ADD -->
			<label for="inputID" class="control-label">ADD</label> <br /> 주소 :
			${login_add}<br /> 수정할 주소 :
			<div class="form-group">
				<input type="text" id="add" name="add" class="form-control"
					placeholder="ADD" readonly />
			</div>
			<br />
			<br />
		</div>


		<div class="Zip_Code">
			<!-- ZIP_CODE -->
			<label for="inputID" class="control-label">ZIP_CODE</label> <br />
			집번호 : ${login_zip_code}<br /> 수정할 집번호 :
			<div>
				<input type="text" id="zip_Code" name="zip_Code"
					class="form-control" placeholder="ZIP_CODE" readonly /> <input
					type="button" id="zipBtn" value="검색" class="btn btn-warning" />
			</div>
			<br />
			<br />
		</div>


		<div class="Detail_Add">
			<!-- DETAIL_ADD -->
			<label for="inputID" class="control-label">DETAIL_ADD</label> <br />
			상세 주소 : ${login_detail_add}<br /> 수정할 상세주소
			<div class="form-group">
				<input type="text" id="detail_add" name="detail_add"
					class="form-control" placeholder="DETAIL_ADD" />
			</div>
			<br />
			<br />
		</div>


		<input type="submit" value="수정" class="btn btn-warning">
	</div>

	<div class="col-md-2"></div>
</div>

</body>








<script
	src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

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