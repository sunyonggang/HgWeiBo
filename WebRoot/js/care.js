function careSubmits(temp){
	
	var userid = $.trim($('#userid'+temp).val());
	var careid = $.trim($('#careid'+temp).val());
	var buttonValue = $.trim($('#buttonid'+temp).val());
	var url = "care/careAction.action?care.usersId=" + encodeURI(encodeURI(userid))+"&care.careUserId=" + encodeURI(encodeURI(careid));
	if(buttonValue!=''&&buttonValue=="关注"){
		$.ajax({
			url : url,
			type : 'POST',
			dataType : 'json',
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			success : function(data) {
				if(data==0){
					$('#buttonid'+temp).val("已关注");
					
					var caout = parseInt($('#careCount'+temp).text())+1;
					$('#careCount'+temp).text(caout);
					return ;
			 	}else{
			 		$('#buttonid'+temp).val("已关注");
					return ;
				}
			}
		});
	}else{
		$('#buttonid'+temp).val("已关注");
		return ;
	}
}
function searchClick(){
	var typeString = $.trim($('#typeString').val());
	var temp = $.trim($('#temp').val());
	if (temp == "") {
		$('#temp').val("请输入内容");
		return ;
	}else {
		$('#search').submit();
	}
}
