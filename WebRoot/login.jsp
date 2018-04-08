<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>    
    <title>简易留言板</title>	
  </head>
  
  <body>
    <form action="mainServlet" method="post">
    	<table>
    		<caption>用户登录</caption>
    		<tr>
    			<td>登录名：</td>
    			<td><input type="text" name="username" size="20" /></td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td><input type="password" name="pwd" size="20" /></td>
    		</tr>
    	</table>
    	<input type="submit" value="登录" />
    	<input type="reset" value="重置">
    </form>
	如果没有注册，请单击<a href="register.jsp">这里</a>注册!
  </body>
</html>
