<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>
    <title>���԰�</title>
  </head>
  <body>
    <form action="RegisterServlet" method="post">
    	<table>
    		<caption>�û�ע��</caption>
    		<tr>
    			<td>��¼����</td>
    			<td><input type="text" name="username" size="20" /></td>
    		</tr>
    		<tr>
    			<td>���룺</td>
    			<td><input type="password" name="pwd" size="20" /></td>
    		</tr>
    	</table>
    	<input type="submit" value="ע��" />
    	<input type="reset" value="����">
    </form>
  </body>
</html>
