$(document).ready(function(){
	$('#username').blur(function(){
		if($('#username').val() != ''){
			$.ajax({
				url : 'getPwd.action?sysManageModel.userName='+$('#username').val(),
				type : 'POST',
				dataType : 'json',
				success : function(data) {
					if(data!=null && data.pwd != null){
						$('#password').val(data.pwd);
					}
				}
			});	
		}
	});
});
function checkLogin(){
		var username = $('#username').val();
		var password = $('#password').val();
		var url = "checkLogin.action?sysManageModel.userName=" + encodeURI(encodeURI(username)) + "&sysManageModel.password=" + encodeURI(encodeURI(password));
		$.ajax({
			url : url,
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				if(data==0){
					$('#loginSpan').html('<span style="color:red;font-size:13px">&nbsp;&nbsp;&nbsp;&nbsp;用户名或密码错误</span>');
					$('#username').val("");
					$('#password').val("");
					return;
			 	}else{
					$('#loginSpan').html('<span style="color:green;font-size:13px">&nbsp;&nbsp;&nbsp;&nbsp;登录成功</span>');
					$('#subButton').hide();
					$('#loginForm').submit();
					return;
				}
			}
		});	
}