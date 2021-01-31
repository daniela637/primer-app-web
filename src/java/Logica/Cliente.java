
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity        
public class Cliente implements Serializable {
    
    @Id
     @GeneratedValue  (strategy = GenerationType.SEQUENCE)       
     int id_cliente;
    @Basic
     int dni;
     String nombre;
    String apellido;
    @OneToMany
    List <Entrada> listaEntradas;

    public Cliente() {
    }

    public Cliente(int id_cliente, int dni, String nombre, String apellido, List<Entrada> listaEntradas) {
        this.id_cliente = id_cliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaEntradas = listaEntradas;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public List<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(List<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }
    
    
}
