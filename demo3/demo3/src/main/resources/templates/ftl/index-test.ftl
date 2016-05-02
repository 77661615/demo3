<#macro greet username="huanggl">
  <font size="+2">Hello ${username}!</font>
</#macro>

<#macro hello>
  
  <div>
  	<#nested>
  </div>
</#macro>

<#macro border >
<table border=4 cellspacing=0 cellpadding=4><tr><td>
	<#nested>
</td></tr></table>
<@hello>
	<p>宏嵌套宏</p>
</@hello>

</#macro>

<html>
<head>
	<title>hello</title>
</head>
<body>
<p>hellooooo</p>
<@greet username="张三"/>


<@border>
	这里是netsted的嵌套内容区！
</@border>
</body>

</html>