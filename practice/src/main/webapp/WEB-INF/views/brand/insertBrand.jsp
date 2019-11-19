<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <form action="/brand/addBrand">
    NAME : <input type="text" name="name"> <br /> 
   	TYPE : 
   		<select name = "type">
   			<option value='PIZZA'>PIZZA</option>
   			<option value='CHICKEN'>CHICKEN</option> 	
   		</select>	
   PATH : <input type="text" name="path"> <br /> 
   
   <input type="hidden" name="brand_uid" value="4"> <br /> 
   

   <input type="submit" value="브랜드 등록" />
   
   </form>