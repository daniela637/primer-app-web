
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daniela
 */
@WebServlet(name = "ediEmpleado2", urlPatterns = {"/ediEmpleado2"})
public class ediEmpleado2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         int dni =  Integer. parseInt (request.getParameter("dni"));  
    String nombre = request.getParameter("nombre");
    String apellido= request.getParameter("apellido");
         String cargo= request.getParameter("cargo");
          
        response.sendRedirect("menu.jsp");
         
         Controladora control = new Controladora();
         control.ediEmpleado(dni,nombre,apellido,cargo);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
