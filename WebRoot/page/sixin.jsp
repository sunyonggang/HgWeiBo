<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<base href="<%=basePath%>">
<title>私信</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
<!--
body {
	background-image: url(photo/66C78662FF2DDB1009648BA2C6360F28.jpg);
}
#Layer1 {
	position:absolute;
	left:308px;
	top:101px;
	width:487px;
	height:29px;
	z-index:1;
}
#Layer2 {
	position:absolute;
	left:307px;
	top:144px;
	width:490px;
	height:37px;
	z-index:2;
}
#Layer3 {
	position:absolute;
	left:307px;
	top:191px;
	width:492px;
	height:367px;
	z-index:3;
}
#Layer4 {
	position:absolute;
	left:45px;
	top:14px;
	width:259px;
	height:253px;
	z-index:4;
}
#Layer5 {
	position:absolute;
	left:307px;
	top:648px;
	width:490px;
	height:36px;
	z-index:5;
}
.STYLE5 {font-size: 16px; }
-->
</style>
<script language="JavaScript" type="text/JavaScript">
<!--
function MM_reloadPage(init) {  //reloads the window if Nav4 resized
  if (init==true) with (navigator) {if ((appName=="Netscape")&&(parseInt(appVersion)==4)) {
    document.MM_pgW=innerWidth; document.MM_pgH=innerHeight; onresize=MM_reloadPage; }}
  else if (innerWidth!=document.MM_pgW || innerHeight!=document.MM_pgH) location.reload();
}
MM_reloadPage(true);
//-->
</script>
</head>
  
  <<body>
<div id="Layer4"><img src="photo/1370426853451.jpg" width="255" height="250" /></div>
<div id="Layer1" style="position:absolute; left:302px; top:131px; width:491px; height:522px; z-index:5">
  <form name="form1" method="post" action="message/messageAction.action">
    <table width="75%" border="0">
     
      <tr> 
        <td colspan="2"><textarea cols="68" rows="10" name="message.info"></textarea></td>
      </tr>
      <tr> 
        <td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="发送" name="submits"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="reset" value="重围" name="submits"/></td>
      </tr>
      <tr>
      
      	<td><input type="hidden" name="message.receivedUserid" value="<%=request.getParameter("friendId") %>" /></td>
      	
      </tr>
    </table>
  </form>
</div>
<table width="785" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutDefaultTable-->
  <tr>
    <td width="295" height="623">&nbsp;</td>
    <td width="490" valign="top"><img src="photo/e001.gif" width="486" height="101" /></td>
  </tr>
</table>
</body>
</html>
