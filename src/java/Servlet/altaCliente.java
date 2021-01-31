
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "altaCliente", urlPatterns = {"/altaCliente"})
public class altaCliente extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         int dni = Integer. parseInt (request.getParameter("dni1"));
     String nombre = request.getParameter("nombres");
    String apellido = request.getParameter("apellidos");
        
     response.sendRedirect("menu.jsp");
     
      
         Controladora control = new Controladora();
         control.crearCliente(dni,nombre,apellido);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
