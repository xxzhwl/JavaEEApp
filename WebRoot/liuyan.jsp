<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<html>
  <head>
    <title>���԰�</title>	
  </head>
  
  <body>
    <center>
    	<form action="AddServlet" method="post">
    		<table border="1">
    			<caption>��д������Ϣ</caption>
    			<tr>
    				<td>���Ա���</td>
    				<td><input type="text" name="title" /></td>
    			</tr>
    			<tr>
    				<td>��������</td>
    				<td>
    					<textarea name="content" rows="5" cols="35">
    					</textarea>
    				</td>
    			</tr>
    		</table>
    		<input type="submit" value="�ύ" />
    		<input type="reset" value="����" />
    	</form>
    </center>
  </body>
</html>
