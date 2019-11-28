<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<h1> 나는 작성 페이지야 </h1>

<form action="wirteBoard" method="get">
	제목 : <input type="text" id="title" name="title" />
	<br />
	작성자 : <input type="text" id="author" name="author" />
	
	<br />
	
	내용 : <input type="text" id="content" name="content" />
	<br />
	<input type="submit" value="글 작성완료" />
</form>