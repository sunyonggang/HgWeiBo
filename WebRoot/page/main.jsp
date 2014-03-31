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
.STYLE4 {
	font-family: "华文彩云", "方正舒体", "宋体";
	color: #00FF00;
	font-size: 24px;
}
body {
	background-image: url(photo/66C78662FF2DDB1009648BA2C6360F28.jpg);
	margin-left: 800px;
}
#Layer4 {
	position:absolute;
	left:59px;
	top:165px;
	width:141px;
	height:79px;
	z-index:4;
}
#Layer5 {
	position:absolute;
	left:500px;
	top:167px;
	width:276px;
	height:172px;
	z-index:5;
}
#Layer6 {
	position:absolute;
	left:58px;
	top:646px;
	width:174px;
	height:88px;
	z-index:6;
}
#Layer7 {
	position:absolute;
	left:47px;
	top:473px;
	width:154px;
	height:27px;
	z-index:7;
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

#centre {
	position:absolute;
	left:500px;
	top:430px;
	width:732px;
	height:800px;
	z-index:9;
}
-->
</style>
<script type="text/javascript" language="javascript"
			src="js/jquery-1.4.1.min.js"></script>
		<script type="text/javascript" language="javascript"
			src="js/care.js"></script>
			<script type="text/javascript" language="javascript" src="js/weiboManage.js"></script>
</head>

<body>
<div id="Layer1"> 
  <form id="form1" name="form1" method="post" action="">
    <table width="205" border="0" cellpadding="1">
      <!--DWLayoutTable-->
      <tr>
        <td width="35%" rowspan="2"><img src="photo/0(6).jpg" width="66" height="75" /></td>
        <td colspan="2">昵称：</td>
		<td><s:a href="page/person.jsp">${user.userName }</s:a></td>
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
        <td><span class="STYLE12"><a href="message/searchMessageAction.action">我的私信</a></span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr> 
        <td><span class="STYLE12"><a href="page/person.jsp">个人档案</a></span></td>
      </tr>
      <tr> 
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td><span class="STYLE12"><a href="page/search.jsp">微博搜索</a></span></td>
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
<div id="Layer3"> 
  <form id="form3" name="form3" method="post" action="">
    <table width="100%" border="0" cellspacing="2" cellpadding="1">
      <tr>
        <td colspan="2"><label>
          <input type="image" name="imageField" src="photo/2013-06-26_104510.png" />
        </label></td>
      </tr>
      
       <tr>
      <td style="display: none"><input id="usersId"  type="text" value="${user.usersId }"></input></td>
      <td style="display:none"><input id="username"  type="text" value="${user.userName }"></input></td>
      </tr>
 
      <tr>
        <td><p>
          <label>
          <textarea name="weiboInfo" id="weiboInfo" cols="80" rows="8"></textarea>
          </label>
        </p>
          <table width="100%" border="0" cellspacing="２" cellpadding="1">
            <tr>
              <td width="29%">　　
                <label>
                <input type="image" name="imageField2" src="photo/Insert1.gif" />
                <a href="file">插入图片</a></label></td>
              <td width="24%"><label>
                <input type="image" name="imageField3" src="photo/Insert2.gif" />
              </label>
              插入视频</td>
              <td width="21%"><label>
                <input type="image" name="imageField4" src="photo/biaoqing/biaoqing_bg.gif" />
                <a href="javascript:biaoQingXianShi()" class="al">插入表情</a></label></td>
              <td width="26%"><label>
                
                </label><div align="right">
                  <input type="button" name="Submit2" value="发布" onclick="checkPublish()"/>
                </div>
              </td>
            </tr>
          </table>          
          <label> </label>
        <p>
          <label>
          　　          </label>
          <label></label>
        </p></td>
        <td>&nbsp;</td>
      </tr>
    </table>
  </form>
</div>

<div id="Layer8">
  <div align="center" class="STYLE10"></div>
  <div align="center"><img src="photo/e001.gif" width="474" height="101" /></div>
</div>
<div id="Layer4" style="position:absolute; left:1018px; top:397px; width:236px; height:139px; z-index:9">
<s:iterator value="hotCares" status="hot">
  <form action="" name="form1" id="form1">
  <table width="95%" height="30" border="0">
    <tr bordercolor="#FFFFFF" > 
      <td colspan="2"><s:property value="userName"/></td>
    </tr>
    <tr bordercolor="#FFFFFF"> 
      <td>关注数:<span id="careCount<s:property value='#hot.count'/>"><s:property value="careCount"/></span></td>
      <td><input type="button" value="关注" name="buttonid" id="buttonid<s:property value='#hot.count'/>" onclick="careSubmits(<s:property value='#hot.count'/>)"></input></td>
    </tr>
    <tr bordercolor="#FFFFFF">
    <td><input type="hidden" name="userid" id="userid<s:property value='#hot.count'/>" value="${user.usersId}"/></td>
    <td><input type="hidden" name="careid" id="careid<s:property value='#hot.count'/>" value="<s:property value='usersId'/>"/></td>
    </tr>
  </table>
  </form>
  </s:iterator></div>
<label></label>
  
<label></label>
  
<label></label>

<label></label>
<div id="Layer6"> 
  <form id="form9" name="form9" method="post" action="">
    <table width="100%" border="0" cellspacing="2" cellpadding="1">
      <tr>
        <td>分组 管理<img src="photo/focus.gif" width="23" height="19" /></td>
      </tr>
      <tr>
        <td><img src="photo/AXXR.gif" width="22" height="28" />特别关注</td>
      </tr>
      <tr>
        <td><img src="photo/AXXR.gif" width="23" height="24" /><a href="javascript:findClassmate()">同事</a></td>
      </tr>
       <s:iterator value="friendlists1">
      	   <tr>
      	   <td><s:property value="friendsNick"/><input type="button" id="sixin<s:property value="friendId"/>" value="私信" onclick="sendMessage(<s:property value="friendId"/>)"/></td>
      	   </tr>
      </s:iterator>
      <tr>
        <td><img src="photo/AXXR.gif" width="22" height="27" />同学</td>
      </tr>
      <s:iterator value="friendlists2" status="friend">
      	   <tr>
      	   <td><s:property value="friendsNick"/><input type="button" id="sixin<s:property value="friendId"/>" value="私信" onclick="sendMessage(<s:property value="friendId"/>)"/></td>
      	   </tr>
      </s:iterator>
      <tr>
        <td><img src="photo/AXXR.gif" width="23" height="27" />爱人</td>
      </tr>
    </table>
  </form>
</div>

<div id="centre">
	<div id="weiboList">
	
	<s:iterator value="weiboList">
	<table style="margin-top: 20px">
	   <tr>
	   		<td>
	   			<s:property value="userName"/>:
	   			<font color="green">#<s:property value="theme"/>#</font><s:property value="content"/>
	  		 </td>
	   </tr>
	   <tr>
	         <td>
	           &nbsp;&nbsp;&nbsp;&nbsp; <a href="javascript:initComment(<s:property value='weiboId'/>)"><font color="green" id="font<s:property value='weiboId'/>">评论(<s:property value="comentCount"/>)</font></a> &nbsp;&nbsp;
	           <a href="javascript:submitRefend(<s:property value='weiboId'/>)"><font color="green" id="font1<s:property value='weiboId'/>"> 转发(<s:property value="forewardCount"/>) </font></a>        
	         </td>
	         <td>
	           
	         </td>
	   </tr>
	   <tr>
	            <td>
	         	<div style="display: none" class="<s:property value='weiboId'/>">
	         	   <textarea rows="3" cols="30" id="text<s:property value='weiboId'/>"></textarea>
	         	   <br>
	         	   <input style="text-align: right" type="button" onclick="submitComment(<s:property value="weiboId"/>)" value="评论"/>
	         	</div>
	         	</td>
	   </tr>
	   </table>
	</s:iterator>
	
	</div>

</div>
</body>
</html>