
package Persistencia;



import Logica.Cliente;
import Logica.Empleado2;
import static Logica.Empleado2_.id_empleado;
import Logica.Juego;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;import Logica.Empleado2;
import static Logica.Empleado2_.id_empleado;
import Logica.Entrada;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    
    UsuarioJpaController usuJPA = new  UsuarioJpaController ();
    Empleado2JpaController empleJPA = new Empleado2JpaController();
    JuegoJpaController jueJPA = new     JuegoJpaController ();
    ClienteJpaController cliJPA = new ClienteJpaController();
    EntradaJpaController entraJPA = new EntradaJpaController ();

   
    public void crearUsu(Usuario usuario) {
        
      
        try {
            usuJPA.create(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public List<Usuario> getUsuarios() {
       List<Usuario>listaUsuarios;
       listaUsuarios = usuJPA.findUsuarioEntities();
       
       return listaUsuarios;
    }

   

    public void crearEmpleado(Empleado2 emple) {
        
          try {
             empleJPA.create(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado2> getEmpleados() {
       List<Empleado2>listaEmpleado;
       listaEmpleado = empleJPA.findEmpleado2Entities();
       
       return listaEmpleado;
    }
    
    public List<Juego> getJuego() {
       
        List<Juego>listaJuegos;
        listaJuegos = jueJPA.findJuegoEntities();
        
        return listaJuegos;
    }
    
    public List<Cliente> getCliente() {
       
        List<Cliente>listaClientes;
        listaClientes = cliJPA.findClienteEntities();
        return listaClientes;
    }

    public void eliminarEmpleado( int id_empleado){
        
         try {
            empleJPA.destroy(id_empleado);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    public void crearJuego(Juego juego) {
       
       
         try {
           jueJPA.create(juego);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void crearCliente(Cliente cli) {
       
        try {
            cliJPA.create(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void editarEmpleado(Empleado2 emple) {
        
        try {
            empleJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarJuego(Juego jue) {
        try {
            jueJPA.edit(jue);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Empleado2 buscarUsuario(int id_editar) {
      
       
       return empleJPA.findEmpleado2(id_editar);
       
    }

    public void ediEmpleado(Empleado2 emple) {
        try {
            empleJPA.edit(emple);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

  

    

  

    
    
    
}
