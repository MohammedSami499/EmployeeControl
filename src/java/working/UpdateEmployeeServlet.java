/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package working;

import hibernate.Crud;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pojo.Employee;

/**
 *
 * @author Mohammmed Sami
 */
public class UpdateEmployeeServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String message;
        String color;
        
        if(request.getParameter("id") == null){
            message = "Can't Find This User";
            color = "red";
        }else{
        
            int pk = Integer.parseInt(request.getParameter("id"));
            String first = request.getParameter("first");
            String last = request.getParameter("last");
            String position = request.getParameter("position");
            String salary = request.getParameter("salary");

            Employee emp = new Employee();

            emp.setEmpId(pk);
            emp.setFirstName(first);
            emp.setLastName(last);
            emp.setPosition(position);
            emp.setSalary(salary);
        
            Crud c = new Crud();
            c.updateEmployee(emp);
            
            message = "Employee Updated Successfully";
            color = "green";
        }
        request.setAttribute("message", message);
        request.setAttribute("color", color);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/updateEmployee.jsp");
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
