/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Controladora;
import Logica.Empleado2;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author daniela
 */
@WebServlet(name = "ediEmpleado", urlPatterns = {"/ediEmpleado"})
public class ediEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         
        int id_editar = Integer. parseInt (request.getParameter("idEditar"));
      
        
    
     
      
         Controladora control = new Controladora();
        Empleado2 emple = control.buscarUsuario(id_editar);
        
        
        HttpSession misession = request.getSession(true);
        misession.setAttribute("empleado", emple);
        
        response.sendRedirect("editarEmpleado.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
