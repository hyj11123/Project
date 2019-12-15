<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <form action="/pizza/addPizza">
    NAME : <input type="text" name="name"> <br />
    TYPE :
    
    <select name = "type">
   			<option value='PIZZA'>PIZZA</option>
   			<option value='CHICKEN'>CHICKEN</option> 	
   		</select>	
   		
    PATH : <input type="text" name = "path"> <br />
    
    <input type="hidden" name="brand_uid" value="2"> <br /> 
    
    <input type="submit" value = "피자 등록" />
    </form>
    
    