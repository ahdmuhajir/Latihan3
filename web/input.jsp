<%-- 
    Document   : input.jsp
    Created on : May 23, 2017, 8:23:07 PM
    Author     : ahdmuhajir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">         
        <title>JSP Page</title>     
    </head>     
    <body>         
        <form ACTION="hello.jsp" METHOD="get">                         
            Silakan masukkan nama anda : <BR>            
            <INPUT TYPE="text" NAME="nama"> <BR>                       
            Silakan masukkan NIM Anda : <BR>            
            <INPUT TYPE="text" NAME="nim"> <BR>                       
            Silakan masukkan Jurusan anda : <BR>            
            <INPUT TYPE="text" NAME="jurusan"> <BR>                       
            <INPUT TYPE="SUBMIT" VALUE="Kirim">     
        </form>
    </body> 
</html> 