
package Servlet;

import Logica.Controladora;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "altaEmpleado", urlPatterns = {"/altaEmpleado"})
public class altaEmpleado extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        
        int dni =  Integer. parseInt (request.getParameter("dni"));  
    String nombre = request.getParameter("nombre");
    String apellido= request.getParameter("apellido");
         String cargo= request.getParameter("cargo");
          
        response.sendRedirect("menu.jsp");
         
         Controladora control = new Controladora();
         control.crearEmpleado(dni,nombre,apellido,cargo);
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
