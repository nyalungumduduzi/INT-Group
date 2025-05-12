<%-- 
    Document   : get_all_accountholders_outcome
    Created on : 09 May 2025, 6:52:29 PM
    Author     : student
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.entities.AccountHolder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get All Account Holders Page</title>
    </head>
    <body>
        <h1>List of Account Holders</h1>
        <%
            List<AccountHolder> list = (List<AccountHolder>)request.getAttribute("holder");            
        %>
        
        <table>
            <%
                for(int i = 0; i < list.size(); i++){
                   AccountHolder p = list.get(i);
                   String fullname = p.getFullName();
                   String street = p.getStreet();
                   Long id = p.getId();
                   String city = p.getCity();
                   String code = p.getCode();
                   String cellno = p.getCellNo();
                   String emailAddress = p.getEmailAddress();          
                
            
            %>
            <tr>
                <td>ID :</td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>Full Name :</td>
                <td><%=fullname%></td>
            </tr>
            <tr>
                <td>Street :</td>
                <td><%=street%></td>
            </tr>
            <tr>
                <td>City :</td>
                <td><%=city%></td>
            </tr>
            <tr>
                <td>Code :</td>
                <td><%=code%></td>
            </tr>
            <tr>
                <td>Email Address :</td>
                <td><%=emailAddress%></td>
            </tr>
            <tr>
                <td>Cell Number :</td>
                <td><%=cellno%></td>
            </tr>
            <tr>
                <td></td>
            </tr>
            <tr>
                
            </tr>
            <%
                }
            %>
        </table>
            <p>
                Click <a href="menu.jsp">here</a> to go back to the main menu
                
            </p> 
    </body>
</html>
