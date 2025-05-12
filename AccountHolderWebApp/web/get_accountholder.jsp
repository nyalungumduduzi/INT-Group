<%-- 
    Document   : get_accountholder
    Created on : 09 May 2025, 2:57:35 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Account Holders Page</title>
    </head>
    <body>
        <h1>Get Account Holders</h1>
        <p>
            Please click on the button below to get all account holders.
        </p>
        <form action="GetAccountHoldersServlet.do" method="GET">
            <table>
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET ACCOUNT HOLDERS"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
