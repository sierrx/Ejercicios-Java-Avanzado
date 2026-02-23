
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Producto;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    ProductoJpaController productoJpa = new ProductoJpaController();
    
    public void crearProducto(Producto producto){
        
        productoJpa.create(producto);
    }
    
     public void borrarProducto(int id){
        try {
            productoJpa.destroy(id);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //traer una sola
        public Producto traerProducto(int id){

            return productoJpa.findProducto(id);

        }

        //traer varias personas
        public List<Producto> traerProducto(){
            return productoJpa.findProductoEntities();
        }

        //persona que llega como parmatro es la persona con datos a modificar
        public void modificarProducto(Producto producto){
            try {
                productoJpa.edit(producto);
            } catch (Exception ex) {
                Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
