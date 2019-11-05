<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

   	<div class="row">
   		<div class="col-md-2"></div>
   		
   		<div class="col-md-8">
   			
   			<h1>자유게시판</h1>
   			<hr>
   			
   			<br />
   			<table class="table table-hover">
   				<thead>
   					<tr>
   						<th>글번호</th>
   						<th>제목</th>
   						<th>작성자</th>
   					</tr>
   				</thead>
   					
   				<tbody>
   					<c:forEach items="${bList}" var="b">
   						<tr>
   							<td>${b.t_uid }</td>
   							<td>${b.t_title }</td>
   							<td>${b.t_author }</td>
   						</tr>
   					
   					</c:forEach>
   				</tbody>
   			</table>
   			
   			<button type="button" class="createBtn" id="createBtn" name="createBtn" onclick="create()">글 작성</button>
   			
   		</div>
   		
   		<div class="col-md-2"></div>
   	
   	
   	</div> <!-- END ROW -->
   	
   	
   	
   	<script>
   	
   	function create(){
   		location.href="moveWritePage";
   	}
   	
   	</script>
   	