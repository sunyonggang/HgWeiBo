function findClassmate(){
	var username = "ͬ��";
	var url = "friend/friendManagerAction.action?friendString=" + encodeURI(encodeURI(username));
	if(username!=''&&username.length!=0){
		$.ajax({
			url : url,
			type : 'POST',
			dataType : 'json',
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			success : function(data) {
				if(data==0){
					$('#userNameSpan').html('<span style="color:red;font-size:12px">&nbsp;&nbsp;�û��Ѵ��ڣ�</span>');
					$('#userName').val("");
					$('#isSubmit').val("no");
					return;
			 	}else{
					$('#userNameSpan').html('<span style="color:green;font-size:12px">�Ϸ����û�</span>');
					$('#isSubmit').val("yes");
					return;
				}
			}
		});
	}else{
		$('#isSubmit').val("no");
		$('#userNameSpan').html('<span style="color:red;font-size:12px">�û���Ϊ�գ�</span>');
	}
}
