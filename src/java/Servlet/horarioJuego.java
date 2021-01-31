
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "horarioJuego", urlPatterns = {"/horarioJuego"})
public class horarioJuego extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       String horarioApertura = request.getParameter("HorarioAper");
        String horarioCierre = request.getParameter("HorarioCie");
        
           response.sendRedirect("CargarJuego.jsp");
        
       
        
         Controladora control = new Controladora();
         control.crearJuego(horarioApertura,horarioCierre);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
