<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
 	
  </head>

    
 <div class="container">
 	
	<form class="form-signin" action="${pageContext.request.contextPath }/signin/userCheck" method="POST">
		<h2 class="form-signin-heading">Log in</h2>
		<label for="inputEmail" class="sr-only">ID</label>
		<input type="text" id="userId" name="userId" class="form-control" placeholder="ID..." required autofocus>
		
		<label for="inputPassword" class="sr-only">Password</label>
		<input type="password" id="userPass" name="userPass"class="form-control" placeholder="PASSWORD..." required>
		
		<div class="checkbox">
			<label>
				<input type="checkbox" value="remember-me"> Remember me
			</label>
		</div>
		
		<button class="btn btn-lg btn-primary btn btn-warning" type="submit">Sign in</button>
	</form>

</div> <!-- /container -->




    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/ie10-viewport-bug-workaround.js"></script>
  </body>

