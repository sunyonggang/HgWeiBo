function checkUserName()
{
	var username = $('#userName').val();
	//encodeURI(username);
	var url = "person/checkUserIsOk.action?user.userName=" + encodeURI(encodeURI(username));
	if(username!=''&&username.length!=0){
		$.ajax({
			url : url,
			type : 'POST',
			dataType : 'json',
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			success : function(data) {
				if(data==0){
					$('#userNameSpan').html('<span style="color:red;font-size:12px">&nbsp;&nbsp;用户已存在！</span>');
					$('#userName').val("");
					return 0;
			 	}else{
					$('#userNameSpan').html('<span style="color:green;font-size:12px">合法的用户</span>');
					return 1;
				}
			}
		});
	}else{
		$('#userNameSpan').html('<span style="color:red;font-size:12px">用户不为空！</span>');
		return 0;
	}
}

function chekNick(){
	var nick = $.trim($('#nick').val());
	if (nick!=""&&nick.length>0) {
		$('#nickSpan').html('<span style="color:red;font-size:12px"></span>');
		return 1;
	}else{
		$('#nickSpan').html('<span style="color:red;font-size:12px">呢称不能为空！</span>');
		return 0;
	}
}

function checkEmail(){
	var email = $.trim($('#email').val());
	if (email != ""&&email.length>0) {
		if(!(/^([a-z]*|[A-Z]*|\d*)@([a-z]+|[A-Z]+)\.(com|cn)$/.test(email)))
		{
			$('#emailSpan').html('<span style="color:red;font-size:12px">邮箱格式不对！</span>');
			return 0;
		}else{
			$('#emailSpan').html('<span style="color:red;font-size:12px"></span>');
			return 1;
		}
	}else{
		$('#emailSpan').html('<span style="color:red;font-size:12px">邮箱不能为空！</span>');
		return 0;
		}
}

function checkQQ(){
	var qq = $.trim($('#qq').val());
	if(qq!=''&&qq.length>0)
	{
		if(!(/^\d{5,13}$/.test(qq)))
		{
			$('#qqSpan').html('<span style="color:red;font-size:12px">QQ格式不对！</span>');
			return 0;
		}else{
			$('#qqSpan').html('<span style="color:red;font-size:12px"></span>');
			return 1;
		}
	}else{
		$('#qqSpan').html('<span style="color:red;font-size:12px">QQ不能为空</span>');
		return 0;
	}
}

function submits(){
	var username = checkUserName();
	var nick = chekNick();
	var email = checkEmail();
	var qq = checkQQ();
	if (username!=0&&nick!=0&&email!=0&&qq!=0) {
		$("#form1").submit();
	}else{
		return ;
	}	
}

/*
function checkPassword1()
{
	var password1= $('#password').val();
	if(password1==''||password1==null)
	{
		$('#password1').html('<span style="color:red;font-size:12px">请输入密码！</span>');
	}else{
		$('#password1').html('<span style="color:red;font-size:12px"></span>');
	}
}

function checkPassword()
{
	var password1= $('#password').val();
	var password2= $('#checkpassword').val();
	if(password1==''||password1==null)
	{
		$('#password1').html('<span style="color:red;font-size:12px">请输入密码！</span>');
	}else{
		$('#password1').html('<span style="color:red;font-size:12px"></span>');
		if(password1!=password2)
		{	
			$('#passwordMessage').html('<span style="color:red;font-size:12px">两次密码不一样！</span>');
		}else{
			$('#passwordMessage').html('<span style="color:red;font-size:12px"></span>');
	
		}
	}
}

function checkEmail()
{
	var email = $('#email').val();
	if(email!=''&&email.length>0)
	{
		if(!(/^([a-z]*|[A-Z]*|\d*)@([a-z]+|[A-Z]+)\.(com|cn)$/.test(email)))
		{
			$('#emailMessage').html('<span style="color:red;font-size:12px">邮箱格式不对！</span>');
		}else{
			$('#emailMessage').html('<span style="color:red;font-size:12px"></span>');
		}
	}else{
		$('#emailMessage').html('<span style="color:red;font-size:12px">邮箱不能为空！</span>');
	}
}

function checkQQ()
{
	var qq = $('#qq').val();
	if(qq!=''&&qq.length>0)
	{
		if(!(/^\d{5,13}$/.test(qq)))
		{
			$('#qqMessage').html('<span style="color:red;font-size:12px">QQ格式不对！</span>');
		}else{
			$('#qqMessage').html('<span style="color:red;font-size:12px"></span>');
		}
	}else{
		$('#qqMessage').html('<span style="color:red;font-size:12px"></span>');
	}
}

*/



