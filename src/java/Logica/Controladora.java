
package Logica;



import Persistencia.ControladoraPersistencia;
import java.text.SimpleDateFormat;




import java.util.Date;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia persis = new ControladoraPersistencia();
    private List <Usuario> listaUsuarios;
   

   

    public void crearUsuario(String username, String password) {
        
         Usuario usuario = new Usuario ();
       
        usuario.setUsername(username);
        usuario.setPassword(password);
        
        persis.crearUsu(usuario);
        
    }
    
    public boolean comprobarIngreso (String username, String password){
         boolean siONo= false;
         listaUsuarios= persis.getUsuarios();
         
         for (Usuario usu : listaUsuarios){
             if(usu.getUsername().equals(username) && usu.getPassword().equals(password)){
                 siONo = true;
                 return siONo;
             }
         }
         return siONo;
    }
     


    public void crearEmpleado(int dni, String nombre, String apellido, String cargo) {
       Empleado2 emple = new Empleado2();
      
       
       emple.setDni(dni);
       emple.setNombre(nombre);
       emple.setApellido(apellido);
       emple.setCargo(cargo);
       emple.setUnUsuario(null);
       
       persis.crearEmpleado(emple);
        
        
    }
    public List<Empleado2> getListaEmpleados(){
        
        
        return persis.getEmpleados();
    }
    
    public List<Juego> getListaJuego(){
        
        return persis.getJuego();
    }
    
    public List<Cliente> getListaCliente(){
        
        return persis.getCliente();
    }

    public void eliminarEmpleado(int id_empleado) {
      Empleado2 emple = new Empleado2();
      emple.setId_empleado(id_empleado);
      
      persis.eliminarEmpleado(id_empleado);
    }

    public void crearJuego(String nombreJuego, int capacidad, int edadMinima, double alturaMinima) {
        
        Juego juego = new Juego ();
        
        juego.setNombreJuego(nombreJuego);
        juego.setCantidad(capacidad);
        juego.setEdadMinima(edadMinima);
        juego.setAlturaMinima(alturaMinima);
      juego.setUnHorario(null);
      juego.setListaEmpleados(null);
      juego.setListaEntradas(null);
      
      persis.crearJuego(juego);
        
    }

    
    public void crearJuego(String horarioApertura, String horarioCierre) {
     
        Horario horario = new Horario ();
      
       
        
        
        
    }

    public void crearCliente(int dni, String nombre, String apellido) {
       
        Cliente cli = new Cliente ();
        
        cli.setDni(dni);
        cli.setNombre(nombre);
        cli.setApellido(apellido);
        cli.setListaEntradas(null);
        
        persis.crearCliente(cli);
       
     
         
    }
    
    
    
    
public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm");
        return formateador.format(ahora);
    }

    public void editarEmpleado( int dni, String nombre, String apellido, String cargo) {
       
        Empleado2 emple = new Empleado2();
        
   
        emple.setDni(dni);
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setCargo(cargo);
        
        persis.editarEmpleado(emple);
        
    }

    public void editarJuego( String nombreJuego, int capacidad, int edadMinima, double alturaMinima) {
        
        Juego jue = new Juego ();
//        jue.getId_juego();
        jue.setNombreJuego(nombreJuego);
        jue.setCantidad(capacidad);
        jue.setEdadMinima(edadMinima);
        jue.setAlturaMinima(alturaMinima);
        
        persis.editarJuego(jue);
        
    }

    public Empleado2 buscarUsuario(int id_editar) {
        
        return persis.buscarUsuario(id_editar);
    }

    public void ediEmpleado(int dni, String nombre, String apellido, String cargo) {
      
         Empleado2 emple = new Empleado2();
        
   
        emple.setDni(dni);
        emple.setNombre(nombre);
        emple.setApellido(apellido);
        emple.setCargo(cargo);
        
        persis.ediEmpleado(emple);
    }

}
    

   

   
   

   

   
    

