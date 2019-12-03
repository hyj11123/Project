<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

	<div class="row">
		<div class="col-md-2"></div>
	<form action="/bhc/bhcSubmit">
		<div class="col-md-8">
			<table>
				<tr>
					<td>이름 : <input type="text" name="name"></td>
				</tr>
				<tr>
					<td>가격 : <input type="text" name="price"></td>
				</tr>
				<tr>
					<td>매운정도 : <input type="text" name="spicy"></td>
				</tr>
				<tr>
				 	<td>평가 :<input type="text" name="review"></td>
				</tr>
				<tr>
					<td><input type="hidden" name="brand_uid" value="4"></td>
				<tr>
				<tr>
					<td><input type="submit" value="메뉴 등록" /></tr>
				<tr>
			</table>
		</div>
	</form>
	<div class="col-md-2"></div>
	</div>