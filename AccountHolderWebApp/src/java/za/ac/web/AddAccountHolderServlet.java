/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.ejb.bl.AccountHolderFacade;
import za.ac.ejb.bl.AccountHolderFacadeLocal;
import za.ac.entities.AccountHolder;

/**
 *
 * @author student
 */


public class AddAccountHolderServlet extends HttpServlet {
@EJB 
private AccountHolderFacadeLocal afl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String fullname = request.getParameter("fullname");
       Long id = Long.parseLong(request.getParameter("id"));
       String street = request.getParameter("street");
       String city = request.getParameter("city");
       String code = request.getParameter("code");
       String cellNo = request.getParameter("cellno");
       String emailAddress = request.getParameter("emailaddress");
       
       AccountHolder holder = createAccountHolder(id, fullname, street, city, code, cellNo, emailAddress);
       afl.create(holder);
       
       request.setAttribute("fullname", fullname);
       
        RequestDispatcher disp = request.getRequestDispatcher("add_student_outcome.jsp");
        disp.forward(request, response);
    }
    
    private AccountHolder createAccountHolder(Long id, String fullName, String street, String city, String code, String cellNo, String emailAddress){
        AccountHolder holder = new AccountHolder();
        holder.setId(id);
        holder.setFullName(fullName);
        holder.setStreet(street);
        holder.setCity(city);
        holder.setCellNo(cellNo);
        holder.setEmailAddress(emailAddress);
        holder.setCreationDate(new Date());
        holder.setCode(code);
        
        return holder;
    }
}

