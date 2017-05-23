<%-- 
    Document   : TagMenu.jsp
    Created on : May 23, 2017, 9:05:17 PM
    Author     : ahdmuhajir
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> <!DOCTYPE html>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title>JSP Page</title>

    </head>

    <body>
        <%
    String link = request.getParameter("link");%>

        <jsp:include page="navbar.jsp" flush="true"> <jsp:param name="link" value="<%=link%>"/> </jsp:include>

        <a href="indexMenu.jsp"> KEMBALI KE MENU </a>

    </body>
</html>

