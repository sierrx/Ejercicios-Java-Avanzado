
package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Oficina implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long num_oficina; 
    private String edificio;
    private int piso;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "id_director", referencedColumnName = "id")
    private Director unDirector;

    public Oficina() {
    }

    public Oficina(Long num_oficina, String edificio, int piso, Director unDirector) {
        this.num_oficina = num_oficina;
        this.edificio = edificio;
        this.piso = piso;
        this.unDirector = unDirector;
    }

    public Long getNum_oficina() {
        return num_oficina;
    }

    public void setNum_oficina(Long num_oficina) {
        this.num_oficina = num_oficina;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public Director getUnDirector() {
        return unDirector;
    }

    public void setUnDirector(Director unDirector) {
        this.unDirector = unDirector;
    }
    
    
    
    
    
    
    
}
