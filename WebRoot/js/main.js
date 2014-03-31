function findClassmate(){
	var username = "同事";
	var url = "friend/friendManagerAction.action?friendString=" + encodeURI(encodeURI(username));
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
