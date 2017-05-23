<%-- 
    Document   : proseslatform.jsp
    Created on : May 22, 2017, 9:16:22 PM
    Author     : ahdmuhajir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> <!DOCTYPE html>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> <title>JSP Page</title>

    </head>			
    <body>			
        <%
            String name = request.getParameter("nama");
            String gender = request.getParameter("gender");
            String email = request.getParameter("email");
            String kompetensi = request.getParameter("kompetensi");
            String hoby = "";

            for (int i = 0; i < 5; i++) {

                String hobyy = request.getParameter("hoby" + i);
                if (hobyy != null) {
                    hoby += "	" + hobyy;
                }

            }
        %>

    <body bgcolor=white> <table border=1>

            <tr>

                <td colspan=2>DATA</td> </tr>
            <tr>

                <td>Name :</td> <td><%=name%></td>
            </tr>

            <tr>

                <td>Gender :</td> <td><%=gender%></td>

            </tr>
            <tr>

                <td>Email :</td> <td><%=email%></td>
            </tr>

            <tr>
                <td>Kompetensi :</td>

                <td> <%=kompetensi%> </td> </tr>
            <tr>

                <td>Hoby :</td> <td><%=hoby%></td>

            </tr>
        </table>
    </form>

</body>
</html>
