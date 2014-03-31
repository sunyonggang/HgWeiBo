<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<base href="<%=basePath%>">
<title>注册界面</title>
<script type="text/javascript" language="javascript" src="js/jquery-1.4.1.min.js"></script>
<script type="text/javascript" language="javascript" src="js/register.js"></script>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
<!--
body {
	background-image: url(photo/E98C867DCBC318C28127C8E6FF4F9CA1.jpg);
	margin-left: 100px;
	margin-top: 120px;
}
#Layer1 {
	position:absolute;
	left:104px;
	top:10px;
	width:390px;
	height:16px;
	z-index:1;
}
.STYLE1 {
	font-family: "华文行楷";
	font-size: 18px;
}
#Layer2 {
	position:absolute;
	left:134px;
	top:33px;
	width:436px;
	height:100px;
	z-index:1;
}
-->
</style>
</head>
  
  <body>
    <div id="Layer2">
  
  <!-- <form id="form2" name="form2" method="post" action=""> -->
    <label>
      <input type="image" name="imageField" src="photo/2013-06-26_103817.png" />
    </label>
 <!--  </form>  -->
</div>
<div id="Layer1" style="position:absolute; left:118px; top:158px; width:523px; height:5059px; z-index:2">
  <form name="tijiao" id="tijiao" method="post" action="register/registerAction.action">
    <table width="99%" height="352" border="0">
      <tr> 
        <td width="23%">用&nbsp;&nbsp;户&nbsp;&nbsp;名:</td>
        <td width="37%"><input id="userName" type="text" name="user.userName" onblur="checkUserName()"/></td>
        <td width="40%"><span id="userNameSpan" ></span></td>
      </tr>
      <tr> 
        <td>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</td>
        <td><input type="password" id="password" name="user.password" onblur="checkPassword1()"/></td>
        <td><span id="password1"></span></td>
      </tr>
      <tr> 
        <td>确认密码:</td>
        <td><input type="password" name="checkpassword" id="checkpassword" onblur="checkPassword()"/></td>
        <td><span id="passwordMessage"></span></td>
      </tr>
      <tr> 
        <td>昵&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称:</td>
        <td><input type="text" name="user.nick" /></td>
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</td>
        <td><select name="user.sex">
        <option></option>
        <option>男</option>
        <option>女</option>
      </select></td>
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱:</td>
        <td><input type="text" name="user.email" id="email" onblur="checkEmail()"/></td>
        <td><span id="emailMessage"></span></td>
      </tr>
      <tr>
        <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QQ:</td>
        <td><input type="text" name="user.qq" id="qq" onblur="checkQQ()"/></td>
        <td><span id="qqMessage"></span></td>
      </tr>
      <tr> 
        <td><input type="hidden" name="isSubmit" id="isSubmit" value="no" /></td>
        <td><span id="formMessage"></span></td>
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
        <td><input type="reset" name="reset" value="重置" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button"  id="submit2" name="submit2" value="提交" onclick="submit1()"/></td>
        <td>&nbsp;</td>
      </tr>
    </table>
  </form>
</div>
<label></label>

</body>
</html>
