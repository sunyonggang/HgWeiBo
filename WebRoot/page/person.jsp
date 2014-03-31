<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>个人档案</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">

		<style type="text/css">
<!--
body {
	background-image: url(photo/BBB1994A740BBBEBE63AE072D18CE40B.jpg);
}

#Layer1 {
	position: absolute;
	left: 199px;
	top: 11px;
	width: 501px;
	height: 473px;
	z-index: 1;
}

#Layer2 {
	position: absolute;
	left: 207px;
	top: 50px;
	width: 326px;
	height: 61px;
	z-index: 1;
}

#Layer3 {
	position: absolute;
	left: 231px;
	top: 131px;
	width: 403px;
	height: 337px;
	z-index: 2;
}

.STYLE1 {
	font-size: 36px
}

.STYLE3 {
	color: #FF00FF
}
-->
</style>
		<script type="text/javascript" language="javascript"
			src="js/jquery-1.4.1.min.js"></script>
		<script type="text/javascript" language="javascript"
			src="js/personUpdate.js"></script>
	</head>

	<body>
		<div class="STYLE1" id="Layer2">
			<div align="center">
				<form id="form2" name="form2" method="post" action="">
					<label></label>
					<label>
						<input type="image" name="imageField"
							src="photo/clip_image0011.gif" />
					</label>
				</form>
			</div>
		</div>
		<div id="Layer3">
			<form id="form1" name="form1" method="post"
				action="person/personUpdateAction.action">
				<table width="369" height="369" border="0" cellpadding="2">
					<!--DWLayoutTable-->
					<tr>
						<td width="97" height="17">
							登录名：
						</td>
						<td width="258">
							<label>
								<input type="text" name="user.userName"
									value="${user.userName }" onblur="checkUserName()" id="userName"/>
								<span id="userNameSpan"></span>
							</label>
						</td>
					</tr>
					<tr>
						<td height="17">
							昵称：
						</td>
						<td>
							<label>
								<input type="text" name="user.nick" value="${user.nick }" id="nick" onblur="chekNick()"/>
								<span id="nickSpan"></span>
							</label>
						</td>
					</tr>
					<tr>
						<td height="17">
							真实姓名：
						</td>
						<td>
							<label>
								<input type="text" name="user.trueName" value="${user.trueName}" />
							</label>
						</td>
					</tr>
					<tr>
						<td height="17">
							所在地：
						</td>
						<td>
							<label>
								<input type="text" name="user.birthPlace"
									value="${user.birthPlace}" />
							</label>
						</td>
					</tr>
					<tr>
						<td height="17">
							性别：
						</td>
						<td>
							<label>
								<select name="user.sex">
									<option>
										男
									</option>
									<option>
										女
									</option>
								</select>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							生日：
						</td>
						<td>
							<label>
								<select name="">
									<option>
										1
									</option>
									<option>
										2
									</option>
									<option>
										3
									</option>
									<option>
										4
									</option>
									<option>
										5
									</option>
									<option>
										6
									</option>
									<option>
										7
									</option>
									<option>
										8
									</option>
									<option>
										9
									</option>
									<option>
										10
									</option>
									<option>
										11
									</option>
									<option>
										12
									</option>
								</select>
								月
								<select name="select3">
									<option>
										1
									</option>
									<option>
										2
									</option>
									<option>
										3
									</option>
									<option>
										4
									</option>
									<option>
										5
									</option>
									<option>
										6
									</option>
									<option>
										7
									</option>
									<option>
										8
									</option>
									<option>
										9
									</option>
									<option>
										10
									</option>
									<option>
										11
									</option>
									<option>
										12
									</option>
									<option>
										13
									</option>
									<option>
										14
									</option>
									<option>
										15
									</option>
									<option>
										16
									</option>
									<option>
										17
									</option>
									<option>
										18
									</option>
									<option>
										19
									</option>
									<option>
										20
									</option>
									<option>
										21
									</option>
									<option>
										22
									</option>
									<option>
										23
									</option>
									<option>
										24
									</option>
									<option>
										25
									</option>
									<option>
										26
									</option>
									<option>
										27
									</option>
									<option>
										28
									</option>
									<option>
										29
									</option>
									<option>
										30
									</option>
									<option>
										31
									</option>
								</select>
								日
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							血型：
						</td>
						<td>
							<label>
								<select name="user.bloodType">
									<option>
										A
									</option>
									<option>
										B
									</option>
									<option>
										O
									</option>
									<option>
										AB
									</option>
								</select>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15" colspan="2">
							<span class="STYLE3">联系信息：</span>
						</td>
					</tr>
					<tr>
						<td height="15">
							邮箱：
						</td>
						<td>
							<label>
								<input type="text" name="user.email" value="${user.email}" onblur="checkEmail()" id="email"/>
								<span id="emailSpan"></span>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							QQ：
						</td>
						<td>
							<label>
								<input type="text" name="user.qq" value="${user.qq}" onblur="checkQQ()" id="qq" />
								<span id="qqSpan"></span>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15" colspan="2">
							<span class="STYLE3">教育信息：</span>
						</td>
					</tr>
					<tr>
						<td height="15">
							学位：
						</td>
						<td>
							<label>
								<select name="user.education">
									<option>
										小学
									</option>
									<option>
										初中
									</option>
									<option>
										高中
									</option>
									<option>
										专科
									</option>
									<option>
										本科
									</option>
									<option>
										研究生
									</option>
									<option>
										博士
									</option>
								</select>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							毕业学校：
						</td>
						<td>
							<label>
								<input type="text" name="user.school" value="${user.school}" />
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							所学专业：
						</td>
						<td>
							<label>
								<input type="text" name="user.major" value="${user.major }" />
							</label>
						</td>
					</tr>
					<tr>
						<td height="15" colspan="2">
							<span class="STYLE3">职业信息：</span>
						</td>
					</tr>
					<tr>
						<td height="15">
							所在公司：
						</td>
						<td>
							<label>
								<input type="text" name="user.company" value="${user.company }" />
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							职位：
						</td>
						<td>
							<label>
								<input type="text" name="user.job" value="${user.job }" />
							</label>
						</td>
					</tr>
					<tr>
						<td height="15" colspan="2">
							<span class="STYLE3">标签信息：</span>
						</td>
					</tr>
					<tr>
						<td height="15">
							感情状况：
						</td>
						<td height="15">
							<label>
								<select name="user.emotion">
									<option>
										求交往
									</option>
									<option>
										有对象
									</option>
									<option>
										已婚
									</option>
								</select>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							个人简介：
						</td>
						<td height="15">
							<label>
								<textarea name="user.personalInstruction"
									value="${user.personalInstruction }"></textarea>
							</label>
						</td>
					</tr>
					<tr>
						<td height="15">
							<label>
								<input type="hidden" name="user.usersId"
									value="${user.usersId }"></input>
									<input type="hidden" name="user.password"
									value="${user.password }"></input>
							</label>
						</td>
						<td height="15">
							<label>
								<input type="reset" name="reset" value="编辑" />
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="button" name="Submit" value="完成" onclick="submits()"/>
								<!-- <input type="submit" name="Submit" value="完成"> -->
							</label>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
