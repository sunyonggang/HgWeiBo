<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>登录</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<style type="text/css">
<!--
body {
	background-image: url(photo/66C78662FF2DDB1009648BA2C6360F28.jpg);
}

#Layer1 {
	position: absolute;
	left: 193px;
	top: 216px;
	width: 396px;
	height: 219px;
	z-index: 1;
}

#Layer2 {
	position: absolute;
	left: 186px;
	top: 57px;
	width: 387px;
	height: 96px;
	z-index: 2;
}
-->
</style>
		<script type="text/javascript" language="javascript"
			src="js/jquery-1.4.1.min.js"></script>
		<script type="text/javascript">
function check(){
	var username = $.trim($("#username").val());
	if(username==""){
		$('#cu').html('<span style="color:red;font-size:13px">请输入用户名</span>');
		}
	else{
		$('#cu').html('<span style="color:red;font-size:13px"></span>');
		}
	}

function checkpassword(){
	var password = $.trim($("#password").val());
	if(password==""){
		$('#cp').html('<span style="color:red;font-size:13px">请输入密码 </span>');
		}
	else{
		$('#cp').html('<span style="color:red;font-size:13px"></span>');
		}
	}
	
function submits(){
		var username = $.trim($("#username").val());
		var password = $.trim($("#password").val());
		if(username==""){
			$('#cu').html('<span style="color:red;font-size:13px">请输入用户名</span>');
		}
		else if(password==""){
			$('#cp').html('<span style="color:red;font-size:13px">请输入密码 </span>');
		}
		else{
		$("#form1").submit();
		}
	}
</script>
	</head>

	<body>
		<div id="Layer1">
			<form id="form1" name="form1" method="post" action="loginAction.action"
				>
				<table width="100%" border="0" cellpadding="2">
					<tr>
						<td width="17%">
							<div align="right">
								用户名
							</div>
						</td>
						<td width="44%">
							<label>
								<input type="text" name="user.userName" onblur="check()"
									id="username" />
							</label>
						</td>
						<td width="39%">
							<span id="cu"></span>
						</td>
					</tr>
					<tr>
						<td height="26">
							<div align="right">
								密 码
							</div>
						</td>
						<td>
							<label>
								<input type="password" name="user.password"
									onblur="checkpassword()" id="password" />
							</label>
						</td>
						<td><span id="cp"></span>
						</td>
					</tr>
					<tr>
					
        <td height="20"></td>
		<td ><span style="color:red;font-size:13px"><s:property value="loginerror"/></span></td>
					</tr>
					<tr>
						<td colspan="3">
							<label>
								<div align="left">
									<!--<input name="Submit" type="image" value="登录" onclick="submits()"
										src="photo/yes.png" />
                                  
									-->
									<img name="login" id="login" value="登录" src="photo/yes.png"
										onclick="submits()" />
									<!--  <input name="register" type="button" value="注册" src="photo/regist.png" onclick="window.location.href='page/register.jsp'"/>-->
									<img name="register" value="注册" src="photo/regist.png"
										onclick="window.location.href='register.jsp'" />

								</div>
							</label>
						</td>
					</tr>
				</table>
			</form>
		</div>
		<div id="Layer2">
			<img src="photo/2013-06-22_104014.png" width="408" height="94" />
		</div>
		<s:debug></s:debug>
	</body>
</html>
