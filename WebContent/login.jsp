<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
<link rel="stylesheet" href="Style1.css">
</head>
<body>

<form action="UserController" method="post">
<input type="hidden" name="command" value="USER">
<div class="login-box">
<h4 style="color: green;">${msg}</h4>
  <h1>Login</h1>
  <div class="textbox">
    <i class="fas fa-user"></i>
    <input type="text" name="userId" placeholder="Username">
  </div>

  <div class="textbox">
    <i class="fas fa-lock"></i>
    <input type="password" name="password" placeholder="Password">
  </div>
  <br>
  <label><input type="checkbox" checked="checked" name="remember">Remember me</label>
  <input type="submit" value="Sing in" class="login-btn">
</div>
</form>
</body>
</html>