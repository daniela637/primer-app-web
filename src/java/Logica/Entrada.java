
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Entrada implements Serializable {
    
    @Id
    @GeneratedValue  (strategy = GenerationType.SEQUENCE)
    int id_entrada;
    
    @Temporal(javax.persistence.TemporalType.DATE)
     Date fechaYhoraVenta;

    public Entrada() {
    }

    public Entrada(int id_entrada, Date fechaYhoraVenta) {
        this.id_entrada = id_entrada;
        this.fechaYhoraVenta = fechaYhoraVenta;
    }

    public Date getFechaYhoraVenta() {
        return fechaYhoraVenta;
    }

    public void setFechaYhoraVenta(Date fechaYhoraVenta) {
        this.fechaYhoraVenta = fechaYhoraVenta;
    }

    

   

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    Date setFechaYhoraVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
