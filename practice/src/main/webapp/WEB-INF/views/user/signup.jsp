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
				<input type="text" id="Name" name="Name" class="form-control" placeholder="NAME" />
			</div>
			<!-- ID -->
			<div class="form-group">
				<label for="inputID" class="control-label">ID</label> 
				<input type="text" id="Id" name="Id" class="form-control" placeholder="ID" />
			</div>
			<!-- PASSWORD1 -->
			<div class="form-group">
				<label for="inputID" class="control-label">PASSWORD</label>
				<input type="password" id="Password" name="Password" class="form-control" placeholder="PASSWORD"/>
			</div>

			<!-- PASSWORD2 -->
			<div class="form-group">
				<label for="inputID" class="control-label">PASSWORD CHECK</label> 
				<input type="password" id="Password_Checking" name="Password_Checking" class="form-control" placeholder="PASSWORD CHECK"/>
			</div>

			<!-- EMAIL -->
			<div class="form-group">
				<label for="inputID" class="control-label">EMAIL</label> 
				<input type="email" id="Email" name="Email" class="form-control" placeholder="EMAIL"/>
			</div>

			<!-- ZIPCODE -->
			<div class="form-group">
				<input type="text" id="Zip_Code" name="Zip_Code" class="form-control" placeholder="ZIP_CODE" /> 
				<input type="button" value="검색" class="btn btn-warning"/>
			</div>


			<!-- ADD -->
			<div class="form-group">
				<label for="inputID" class="control-label">주소</label> 
				<input type="text" id="ADD" name="ADD" class="form-control" placeholder="ADD"/>
			</div>

			<!-- DETAIL_ADD -->
			<div class="form-group">
				<label for="inputID" class="control-label">상세주소</label> 
				<input type="text" id="DETAIL_ADD" name="DETAIL_ADD" class="form-control" placeholder="DETAIL_ADD"/>
			</div>

			<div class="form-group">
				<input type="submit" value="JOIN" class="btn btn-warning"/>
			</div>

		</form>

	</div>

	<div class="col-md-2"></div>

</div>