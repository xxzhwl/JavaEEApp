<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="ccc.edu.hut.bean.*" %>
<%@ page import="ccc.edu.hut.database.DB" %>
<%@ page import="java.util.*" %>
<html>
  <head>
    <title>���԰���Ϣ</title>
  </head>
  
  <body>
    <form action="liuyan.jsp" method="post">
    	<table border="1">
    		<caption>����������Ϣ</caption>
    		<tr>
    			<th>����������</th>
    			<th>����ʱ��</th>
    			<th>���Ա���</th>
    			<th>��������</th>
    		</tr>
    		<%
    			ArrayList al = (ArrayList)session.getAttribute("al");
    		    			Iterator it = al.iterator();
    		    			while(it.hasNext()) {
    		    				LyTable ly = (LyTable)it.next();
    		%>
    		<tr>
    			<td><%=new DB().getUserName(ly.getUserId())%></td>
    			<td><%= ly.getDate().toString() %></td>
    			<td><%= ly.getTitle() %></td>
    			<td><%= ly.getContent() %></td>
    		</tr>
    		<%
    			}
    		%>
    	</table>
    	<br />
    	<input type="submit" value="����" />
    </form>
  </body>
</html>
