
package Servlet;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
   

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        boolean okONo= false;
 Controladora control = new Controladora ();
 okONo = control.comprobarIngreso(request.getParameter("user"), request.getParameter("password"));
 
 if(okONo ==true){
     HttpSession misession = request.getSession(true);
     String username = request.getParameter("user");
    String password = request.getParameter("password");
    
    misession.setAttribute("user", username);
    misession.setAttribute("password", password);
    
    response.sendRedirect("menu.jsp");
 }
 else{
     response.sendRedirect("Login_error.jsp");
 }
        
//          String username = request.getParameter("user");
//    String password = request.getParameter("password");
//    
//    request.getSession().setAttribute("user",username);
//    request.getSession().setAttribute("password",password);
//        
//     response.sendRedirect("menu.jsp");
//        
//        
//        Controladora control = new Controladora ();
//        control.crearUsuario(username, password);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
