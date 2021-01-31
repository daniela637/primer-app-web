
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "altaJuego", urlPatterns = {"/altaJuego"})
public class altaJuego extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String nombreJuego = request.getParameter("nombre");
    int capacidad= Integer. parseInt (request.getParameter("capacidad"));
    int edadMinima = Integer. parseInt (request.getParameter("edad"));
    double alturaMinima = Double.parseDouble(request.getParameter("altura"));
       
        
        response.sendRedirect("CargarJuego.jsp");
        
        
         Controladora control = new Controladora();
         control.crearJuego(nombreJuego,capacidad,edadMinima,alturaMinima);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
