function checkUserName()
{
	var username = $('#userName').val();
	var url = "register/checkUserIsOk.action?user.userName=" + encodeURI(encodeURI(username));
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
					$('#isSubmit').val("no");
					return;
			 	}else{
					$('#userNameSpan').html('<span style="color:green;font-size:12px">合法的用户</span>');
					$('#isSubmit').val("yes");
					return;
				}
			}
		});
	}else{
		$('#isSubmit').val("no");
		$('#userNameSpan').html('<span style="color:red;font-size:12px">用户不为空！</span>');
	}
}
function checkPassword1()
{
	var password1= $('#password').val();
	if(password1==''||password1==null)
	{   
		$('#isSubmit').val("no");
		$('#password1').html('<span style="color:red;font-size:12px">请输入密码！</span>');
	}else{
		$('#isSubmit').val("yes");
		$('#password1').html('<span style="color:red;font-size:12px"></span>');
	}
}

function checkPassword()
{
	var password1= $('#password').val();
	var password2= $('#checkpassword').val();
	if(password1==''||password1==null)
	{   
		$('#isSubmit').val("no");
		$('#password1').html('<span style="color:red;font-size:12px">请输入密码！</span>');
	}else{
		$('#password1').html('<span style="color:red;font-size:12px"></span>');
		if(password1!=password2)
		{	
			$('#isSubmit').val("no");
			$('#passwordMessage').html('<span style="color:red;font-size:12px">两次密码不一样！</span>');
		}else{
			$('#isSubmit').val("yes");
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
			$('#isSubmit').val("no");
			$('#emailMessage').html('<span style="color:red;font-size:12px">邮箱格式不对！</span>');
		}else{
			$('#isSubmit').val("yes");
			$('#emailMessage').html('<span style="color:red;font-size:12px"></span>');
		}
	}else{
		$('#isSubmit').val("no");
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
			$('#isSubmit').val("no");
			$('#qqMessage').html('<span style="color:red;font-size:12px">QQ格式不对！</span>');
		}else{
			$('#isSubmit').val("yes");
			$('#qqMessage').html('<span style="color:red;font-size:12px"></span>');
		}
	}else{
		$('#isSubmit').val("yes");
		$('#qqMessage').html('<span style="color:red;font-size:12px"></span>');
	}
}

function submit1()
{
	
	var isSubmit = $('#isSubmit').val();
	var email = $('#email').val();
	var password1= $('#password').val();
	var username = $('#userName').val();
	if(isSubmit=='yes'&&email.length>0&&password1.length>0&&username.length>0)
	{  
		$('#formMessage').html('<span style="color:red;font-size:12px"></span>');
		$("#submit2").hide();
		$("#tijiao").submit();
		
	}else{
		
		$('#formMessage').html('<span style="color:red;font-size:12px">有些输入不合法，请检查</span>');
	}
}





