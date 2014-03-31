function checkPublish()
{   
  
	var usersId=$('#usersId').val();
	var weiboInfo=$('#weiboInfo').val();
	var username=$("#username").val();
	
	if(!(/^#[\u4E00-\u9FA5]+#.+$/.test(weiboInfo))||weiboInfo==''||weiboInfo.length<=0)
	{   
	   
		$('#weiboInfo').val("正确格式：#主题#内容");
	}else{
		
	var weiboArray = weiboInfo.split("#");
	//alert(weiboArray[1]+"  "+weiboArray[2]);
	
	var url = "weibo/weiboPublishAction.action?weibo.theme="+encodeURI(encodeURI(weiboArray[1]))+"&weibo.usersId="+usersId+"&weibo.contents="+encodeURI(encodeURI(weiboArray[2]));
	
	$.ajax({
		url : url,
		type : 'POST',
		dataType : 'json',
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success : function(data) {
			if(data==1){
				alert("发布成功");
				var addInfo ="<table style='margin-top: 20px'><tr><td>"+username+"：&nbsp;"+weiboInfo+"</td></tr>"+"<tr><td>&nbsp;&nbsp;&nbsp;&nbsp; <a><font color='green'>评论(0)</font></a>&nbsp;&nbsp;" +
				"<a><font color='green'> 转发(0) </font></a></td></tr>"+"</table>";
		        $("#weiboList").prepend(addInfo);
				return;
		 	}else{
				
				return;
			}
		}
	});
	
	}
}

function initComment(id)
{   
     
	$("."+id).show();
}

function submitComment(id)
{

	var comment = $("#text"+id).val();
	if(comment!=''&&comment.length>0){
		
        var commentNum = $("#font"+id).text();
 
        var first =parseInt(commentNum.indexOf("("));
    	var end =parseInt(commentNum.indexOf(")"));
    	var sub = parseInt(commentNum.substring(first+1,end));
   
		var url= "weibo/submitCommentAction.action?weibo.commentContent="+encodeURI(encodeURI(comment))+"&weibo.weiboId="+id+"&weibo.comentCount="+sub;
		
		
		$.ajax({
			url:url,
			type:"POST",
			dataType:"json",
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			success:function(data){
			    if(data==1){
			    	$("."+id).hide();
			    	
			    	
			    	var num = sub+1;
			    	
			    	$("#font"+id).text("评论("+num+")");
			    
			    }else{
			    	alert("评论失败！");
			    }
		}
		});
		
	}else{
		alert("评论内容不能为空");
	}
}

function submitRefend(id){
	var refendNum = $("#font1"+id).text();
	var first =parseInt(refendNum.indexOf("("));
	var end =parseInt(refendNum.indexOf(")"));
	var sub = parseInt(refendNum.substring(first+1,end));

   
	var url= "weibo/submitRefendAction.action?weibo.weiboId="+id+"&weibo.forewardCount="+sub;
	
	$.ajax({
		url:url,
		type:"POST",
		dataType:"json",
		contentType: "application/x-www-form-urlencoded; charset=utf-8",
		success:function(data){
		    if(data==1){
		    	var num = sub+1;
		    	$("#font1"+id).text("转发("+num+")");
		   
		    }else{
		    	alert("转发失败！");
		    }
	}
	});
}

function sendMessage(temp){
	/*var userid = $.trim($('#userid'+temp).val());
	var careid = $.trim($('#careid'+temp).val());*/
    alert("hhehe");
	window.location.href="page/sixin.jsp?friendId="+temp;
}
