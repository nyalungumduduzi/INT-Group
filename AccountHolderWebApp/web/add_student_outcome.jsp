<%-- 
    Document   : add_student_outcome
    Created on : 09 May 2025, 4:23:50 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Account Holder Outcome Page</title>
    </head>
    <body>
        <h1>Add account holder outcome</h1>
        
        <%
            String fullname = (String)request.getAttribute("fullname");
        %>
        
        <p>
            <b><%=fullname%></b> has been successfully persisted
            Please click <a href="menu.jsp">here</a> to get back to
            the main page.
        </p>
    </body>
</html>
