
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrito implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "carrito",cascade = CascadeType.ALL)
    private List<Item> listaItems;


    public Carrito() {
    }

    public Carrito(Long id, ArrayList<Item> listaItems) {
        this.id = id;
        this.listaItems = listaItems;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<Item> getListaItems() {
        return (ArrayList<Item>) listaItems;
    }

    public void setListaItems(ArrayList<Item> listaItems) {
        this.listaItems = listaItems;
    }

    
    
    

    
    
    
    
}
