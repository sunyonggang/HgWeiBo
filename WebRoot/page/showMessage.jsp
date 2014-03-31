<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page language="java" import="com.hgweibo.model.FriendManager"%>
<%@page language="java" import="org.apache.struts2.ServletActionContext"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>HG微博</title>
<style type="text/css">
<!--
#Layer1 {
	position:absolute;
	left:1017px;
	top:147px;
	width:230px;
	height:168px;
	z-index:1;
}
#Layer2 {
	position:absolute;
	left:61px;
	top:138px;
	width:138px;
	height:250px;
	z-index:2;
}
#Layer3 {
	position:absolute;
	left:329px;
	top:144px;
	width:585px;
	height:241px;
	z-index:3;
}
#Layer4 {
	position:absolute;
	left:59px;
	top:165px;
	width:141px;
	height:79px;
	z-index:4;
}
body {
	background-image: url(photo/66C78662FF2DDB1009648BA2C6360F28.jpg);
	margin-left: 800px;
}

#Layer8 {
	position:absolute;
	left:51px;
	top:5px;
	width:1105px;
	height:133px;
	z-index:8;
}
.STYLE10 {
	font-size: 36px;
	font-family: "华文彩云", "方正舒体", "宋体";
}
.STYLE12 {font-family: "华文彩云", "方正舒体", "宋体"; color: #FF00FF; font-size: 24px; }
.STYLE13 {font-size: 14px}
#Layer9 {
	position:absolute;
	left:271px;
	top:358px;
	width:529px;
	height:35px;
	z-index:9;
}
-->
</style>
<script type="text/javascript" language="javascript"
			src="js/jquery-1.4.1.min.js"></script>
		<script type="text/javascript" language="javascript"
			src="js/care.js"></script>
</head>

<body>
<div id="Layer1"> 
  <form id="form1" name="form1" method="post" action="">
    <table width="205" border="0" cellpadding="1">
      <!--DWLayoutTable-->
      <tr>
        <td width="35%" rowspan="2"><img src="photo/0(6).jpg" width="66" height="75" /></td>
        <td colspan="2">昵称：</td>
		<td><s:a href="page/person.jsp"><s:property value="user.nick"/></s:a></td>
        <td width="31"></td>
      </tr>
      <tr>
        <td colspan="2">等级：</td>
        <td></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td width="36%">&nbsp;</td>
        <td width="29%">&nbsp;</td>
        <td></td>
      </tr>
      <tr>
        <td><div align="right">关注</div></td>
        <td><div align="center">粉丝</div></td>
        <td>微博</td>
        <td></td>
      </tr>
    </table>
  </form>
</div>
<div id="Layer2">
    <table width="100%" border="0" cellpadding="1">
      <tr> 
        <td><span class="STYLE4">首页</span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td><span class="STYLE12">我的关注</span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td><span class="STYLE12">我的微博</span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td><span class="STYLE12"><a href="safe/sixin.html">我的私信</a></span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td><span class="STYLE12"><a href="safe/per_info.html">个人档案</a></span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td><span class="STYLE12"><a href="safe/search.html">微博搜索</a></span></td>
      </tr>
      <tr> 
        <td>
        <form name="search" id="search" method="post" action="search/searchAction.action">
        <table width="100%" border="0">
  <tr>
              <td>类型:<select name="typeString" id="typeString">
                  <option value="用户名">用户名</option>
                  <option value="主题">主题</option>
                </select></td>
  </tr>
            <tr> 
              <td><input name="temp" type="text" id="temp" /></td>
  </tr>
  <tr>
    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input name="submits" type="button" id="submits"  value="搜索" onclick="searchClick()"/></td>
  </tr>
</table>
</form></td>
      </tr>
    </table>
</div>

<div id="Layer8">
  <div align="center" class="STYLE10"></div>
  <div align="center"><img src="photo/e001.gif" width="474" height="101" /></div>
</div>


<div id="Layer4" style="position:absolute; left:355px; top:257px; width:542px; height:82px; z-index:10"> 
  
  <s:iterator value="m">
  <table width="94%" border="0">
    <tr> 
      <td width="13%">信&nbsp;&nbsp;&nbsp;&nbsp;息:</td>
      <td width="87%"><s:property value="info"/></td>
    </tr>
    <tr> 
      <td>发信者:</td>
      <td><s:property value="usersId"/></td>
    </tr>
    <tr>
      <td>发送日期:</td>
      <td><s:property value="sendDate"/></td>
    </tr>
    <tr> 
      <td>&nbsp;</td>
      <td><a href="page/sixin.jsp?id="<s:property value="usersId"/>>回复</a></td>
    </tr>
    <tr> 
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
  </table>
  </s:iterator>
</div>
<label></label>
  
<label></label>
  
<label></label>

<label></label>

</body>
</html>