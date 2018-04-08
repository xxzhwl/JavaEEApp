<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>
    <title>留言板</title>
  </head>
  <body>
    <form action="RegisterServlet" method="post">
    	<table>
    		<caption>用户注册</caption>
    		<tr>
    			<td>登录名：</td>
    			<td><input type="text" name="username" size="20" /></td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td><input type="password" name="pwd" size="20" /></td>
    		</tr>
    	</table>
    	<input type="submit" value="注册" />
    	<input type="reset" value="重置">
    </form>
  </body>
</html>
