
package persistencia;

import model.Carrito;
import model.Item;


public class ControladoraPersistencia {
    CarritoJpaController carritoJpa= new CarritoJpaController();
    ItemJpaController itemJpa=new ItemJpaController();
    
    public void crearCarrito( Carrito carrito){
        carritoJpa.create(carrito);
        
    }
    
    public void crearItem(Item item){
        
        itemJpa.create(item);
    }
    
    
}
