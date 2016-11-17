<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE>
<html>
<head>
<base href="<%=basePath%>">

<title>Login</title>


<link rel="stylesheet" type="text/css"
	href="bootstarp/css/bootstrap.css">
<script type="text/javascript" src="js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>

</head>
<body>
	<div>
		<div class="col-xs-4 col-xs-offset-4">
			<form action="<%=basePath%>login-action" class="well form-horizontal" >
				<div class="form-group">
					<div class="controls">
						<label class="col-xs-2 control-label" for="input01">用户名</label>
						<input type="text" class="col-xs-5 input-xlarge" id="username" name="username">
					</div>
				</div>
				<div class="form-group">
					<div class="controls">
						<label class="col-xs-2 control-label" for="input01">密码 </label>
						<input type="password" class="col-xs-5 input-xlarge" id="userpwd" name="userpwd">
					</div>
				</div>
				
				<div class="form-group">
					<div class="controls col-xs-3 col-xs-offset-1">
						<button type="submit" class="btn btn-primary" onclick="return check(this.form)">Submit</button>
					</div>
				</div>
			</form>
			<div></div>
</body>
<script type="text/javascript">
  	function check(form){
  		if(form.username.value == "" || form.userpwd.value == ""){
  			return false;
  		}else{
  			return true;
  		}
  	}
  </script>
</html>
