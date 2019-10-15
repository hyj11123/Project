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
		<form action="#" method="post">
		<!-- ID -->
		<div>
			<label>ID</label>
			<input type="text" />
		</div>
		<!-- PASSWORD1 -->
		<div>
			<label>PASSWORD</label>
			<input type="password" />
		</div>
		
		<!-- PASSWORD2 -->
		<div>
			<label>PASSWORD CHECK</label>
			<input type="password" />
		</div>
		
		<!-- EMAIL -->
		<div>
			<label>EMAIL</label>
			<input type="email" />
		</div>
		
		<!-- ZIPCODE -->
		<div>
			<input type="text" />
			<input type="button" value="검색" />
		</div>
		
		
		<!-- ADD -->
		<div>
			<label>주소</label>
			<input type="text" />
		</div>
		
		<!-- DETAIL_ADD -->
		<div>
			<label>상세주소</label>
			<input type="text" />
		</div>
		
		<div>
			<input type="submit" value="JOIN" />
		</div>
		
	</form>
		
	</div>
	
	<div class="col-md-2"></div>
	
</div>