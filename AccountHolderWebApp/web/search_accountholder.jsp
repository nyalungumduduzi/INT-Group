<%-- 
    Document   : search_accountholder
    Created on : 09 May 2025, 2:35:19 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Account Holder Page</title>
    </head>
    <body>
        <h1>Search Account Holder</h1>
        <p>
            Please enter the ID of the account holder to search for.
        </p>
        <form action="SearchAccountHolderServlet.do" method="POST">
            <table>
                <tr>
                    <td>ID: </td>
                    <td><input type="text" name="id"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="SEARCH"/></td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
