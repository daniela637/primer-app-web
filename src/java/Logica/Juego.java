
package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Juego implements Serializable {
    
    @Id
    @GeneratedValue  (strategy = GenerationType.SEQUENCE)
    int id_juego;
    @Basic
    String nombreJuego;
    int cantidad;
    int edadMinima;
    double alturaMinima;
    @OneToMany
    List <Empleado2> listaEmpleados;
    @OneToMany
    List <Entrada> listaEntradas;
    @OneToOne
    Horario unHorario;
    

    public Juego() {
    }

    public Juego(int id_juego, String nombreJuego, int cantidad, int edadMinima, double alturaMinima, List<Empleado2> listaEmpleados, List<Entrada> listaEntradas, Horario unHorario) {
        this.id_juego = id_juego;
        this.nombreJuego = nombreJuego;
        this.cantidad = cantidad;
        this.edadMinima = edadMinima;
        this.alturaMinima = alturaMinima;
        this.listaEmpleados = listaEmpleados;
        this.listaEntradas = listaEntradas;
        this.unHorario = unHorario;
    }

   

    public List<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public void setListaEntradas(List<Entrada> listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

   

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public List<Empleado2> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado2> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

   

    public Horario getUnHorario() {
        return unHorario;
    }

    public void setUnHorario(Horario unHorario) {
        this.unHorario = unHorario;
    }
    
    
    
}
