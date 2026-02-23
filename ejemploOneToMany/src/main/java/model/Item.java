
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombreItem;
    @ManyToOne
    @JoinColumn(name="id_Carrito")
    private Carrito carrito;

    public Item() {
    }

    public Item(Long id, String nombreItem) {
        this.id = id;
        this.nombreItem = nombreItem;
    }
    
    public Item(Long id, String nombreItem, Carrito carrito) {
        this.id = id;
        this.nombreItem = nombreItem;
        this.carrito = carrito;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
    
    
}
