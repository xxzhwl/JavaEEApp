<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ page import="ccc.edu.hut.bean.*" %>
<%@ page import="ccc.edu.hut.database.DB" %>
<%@ page import="java.util.*" %>
<html>
  <head>
    <title>留言板信息</title>
  </head>
  
  <body>
    <form action="liuyan.jsp" method="post">
    	<table border="1">
    		<caption>所有留言信息</caption>
    		<tr>
    			<th>留言人姓名</th>
    			<th>留言时间</th>
    			<th>留言标题</th>
    			<th>留言内容</th>
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
    	<input type="submit" value="留言" />
    </form>
  </body>
</html>
