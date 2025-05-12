/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.bl.AccountHolderFacadeLocal;
import za.ac.entities.AccountHolder;

/**
 *
 * @author student
 */
public class GetAccountHoldersServlet extends HttpServlet {
@EJB 
private AccountHolderFacadeLocal afl;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<AccountHolder> holder = afl.findAll();
        
        request.setAttribute("holder", holder);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_all_accountholders_outcome.jsp");
        disp.forward(request, response);
    }


}
