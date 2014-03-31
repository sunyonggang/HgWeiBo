function testMenu(){
	alert("aaa");
	var MenuItem="";
	var strMenu;
	var sp=true; //使用特效设置，false表示不是用特效
	var ts=6;
	alert("bbb");
	addmenu(1,"显示告警");
	addmenu(1,"显示通知");
	addmenu(2);
	addmenu(1,"刷新单板状态");
	alert("ccc");
	buildmenu();
}


//添加菜单项目
function addmenu(type,caption,url,target,icon)
{
	alert("menu");
  if (!icon) 
      iconpath="jg_n_help.gif";//默认图标路径
     else
      iconpath=icon;
     switch(type)
 {
    case 0:
     if (!target) 
         MenuItem+="<tr height='24'><td><td class='loseitems' onClick=\"javascript:location.href='"+url+"'\" background="+iconpath+">"+caption+"<td>";
     else 
       {
         if (target=='_blank') 
          MenuItem+="<tr height='24'><td><td class='loseitems' onClick=\"javascript:window.open('"+url+"')\" background="+iconpath+">"+caption+"<td>";
         else
             MenuItem+="<tr height='24'><td><td class='loseitems' onClick=\"javascript:"+target+".location.href='"+url+"'\" background="+iconpath+">"+caption+"<td>";      
       }
     break;
    case 1:alert("menu1");
     //MenuItem+="<tr height='24'><td><td class='loseitems' onClick=\"javascript:"+url+"\" background="+iconpath+">"+caption+"<td>";  
     alert("menu11");
     break;
    case 2:alert("menu2");
     //MenuItem+="<tr><td><td align=right colspan=2><hr>";
     break;
 }
}

//建立菜单
function buildmenu(){
 alert("build");
// strMenu = "<div id='menu' class='clsMenu'>";
// strMenu +="<table border='0' cellspacing='0' width='100%' cellpadding='0' onMouseover='highlight()' onMouseout='lowlight()'><tr height='1'><td width='1'><td><td width='1'>";
 //strMenu +=MenuItem;
// strMenu += "<tr height='1'><td><td><td></table>";
 //strMenu += "</div>";
alert("eee");
 //if (isie()) document.write (strMenu);
 //document.oncontextmenu= ;
 alert("ddd");
	 showmenu();
 //document.body.onclick= hidemenu;
}

// 判断客户端浏览器
function isie() {
 if (navigator.appName=="Microsoft Internet Explorer") {
     return true;
 } else {
     return false;
 }
}

// 显示菜单
function showmenu(){
	alert("showmenu");
 //if (isie()){
  var redge=document.body.clientWidth-event.clientX-100;
  var bedge=document.body.clientHeight-event.clientY-25;
  if (redge<menu.offsetWidth){
   menu.style.left=document.body.scrollLeft-menu.offsetWidth;
  }
  else{
   menu.style.left=document.body.scrollLeft+event.clientX+"px";
   
  }
  menu.style.top=document.body.scrollTop+event.clientY+"px";
  menu.style.visibility="visible";
  alert("showmenulast");
  //}
 return false;
}
// 隐藏菜单
function hidemenu(){
 //if (isie()) 
	menu.style.visibility="hidden";
}

// 菜单项获得焦点时加亮显示
function highlight(){
 if (event.srcElement.className=="loseitems"){
  if (sp) 
   event.srcElement.style.filter="revealTrans(duration=.1)" ;event.srcElement.filters[0].transition=ts;
     if (sp) 
      event.srcElement.filters[0].apply();
     event.srcElement.className="menuitems";
     if (sp) 
      event.srcElement.filters[0].play();
 }
}

// 菜单项失去焦点
function lowlight(){
 if (event.srcElement.className=="menuitems"){
  if (sp) event.srcElement.style.filter="blendtrans(duration=.15)" ;
     if (sp) event.srcElement.filters[0].apply();
     event.srcElement.className="loseitems";
     if (sp) event.srcElement.filters[0].play();
 }
}
//--------------js代码结束-------------

//------------插入菜单项目演示---------

//addmenu(type,caption,url,target,icon)
//type=0 超连接 type=1 执行javascript语句 type=2 分割线
//caption 显示文字
//url 地址或javascript语句
//target 目标
//icon 图标
