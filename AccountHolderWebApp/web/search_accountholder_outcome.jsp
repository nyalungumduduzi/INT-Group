<%-- 
    Document   : search_accountholder_outcome
    Created on : 09 May 2025, 6:24:24 PM
    Author     : student
--%>

<%@page import="za.ac.entities.AccountHolder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Account Holder Outcome Page</title>
    </head>
    <body>
        <h1>Get Account Holder Outcome</h1>
        <%
            AccountHolder holder = (AccountHolder)request.getAttribute("holder");
        %>
        
        <p>
            Below are the details of the account holder
        </p>
        <table
            <tr>
                <td>ID :</td>
                <td><%=holder.getId()%></td>
            </tr>
            <tr>
                <td>Full Name :</td>
                <td><%=holder.getFullName()%></td>
            </tr>
            <tr>
                <td>Street :</td>
                <td><%=holder.getStreet()%></td>
            </tr>
            <tr>
                <td>City :</td>
                <td><%=holder.getCity()%></td>
            </tr>
            <tr>
                <td>Code :</td>
                <td><%=holder.getCode()%></td>
            </tr>
            <tr>
                <td>Email Address :</td>
                <td><%=holder.getEmailAddress()%></td>
            </tr>
            <tr>
                <td>Cell Number :</td>
                <td><%=holder.getCellNo()%></td>
            </tr>
            <tr>
                <td>Created :</td>
                <td><%=holder.getCreationDate()%></td>
            </tr>
        </table>
            <p>
                Click <a href="menu.jsp">here</a> to go back to the main menu
                
            </p>    
    </body>
</html>
