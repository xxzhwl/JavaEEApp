<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>    
    <title>�������԰�</title>	
  </head>
  
  <body>
    <form action="mainServlet" method="post">
    	<table>
    		<caption>�û���¼</caption>
    		<tr>
    			<td>��¼����</td>
    			<td><input type="text" name="username" size="20" /></td>
    		</tr>
    		<tr>
    			<td>���룺</td>
    			<td><input type="password" name="pwd" size="20" /></td>
    		</tr>
    	</table>
    	<input type="submit" value="��¼" />
    	<input type="reset" value="����">
    </form>
	���û��ע�ᣬ�뵥��<a href="register.jsp">����</a>ע��!
  </body>
</html>
