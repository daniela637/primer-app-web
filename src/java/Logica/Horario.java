
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Horario implements Serializable {
    
    @Id
    @GeneratedValue  (strategy = GenerationType.SEQUENCE)
    int id_horario;
    @Temporal(TemporalType.TIMESTAMP)
    Date hora_apertura;
    @Temporal(TemporalType.TIMESTAMP)
    Date hora_cierre;

    public Horario() {
    }

    public Horario(int id_horario, Date hora_apertura, Date hora_cierre) {
        this.id_horario = id_horario;
        this.hora_apertura = hora_apertura;
        this.hora_cierre = hora_cierre;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getHora_apertura() {
        return hora_apertura;
    }

    public void setHora_apertura(Date hora_apertura) {
        this.hora_apertura = hora_apertura;
    }

    public Date getHora_cierre() {
        return hora_cierre;
    }

    public void setHora_cierre(Date hora_cierre) {
        this.hora_cierre = hora_cierre;
    }
    
    
    
    
}
