
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Empleado2 implements Serializable {
 
    
     @Id
    @GeneratedValue  (strategy = GenerationType.SEQUENCE)
    int id_empleado;
    @Basic
    int dni;        
    String cargo;
    String nombre;
    String apellido;
    @OneToOne
    Usuario unUsuario;

    public Empleado2() {
    }

    public Empleado2(int id_empleado, int dni, String cargo, String nombre, String apellido, Usuario unUsuario) {
        this.id_empleado = id_empleado;
        this.dni = dni;
        this.cargo = cargo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.unUsuario = unUsuario;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Usuario getUnUsuario() {
        return unUsuario;
    }

    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    
    
    
    
    
}
