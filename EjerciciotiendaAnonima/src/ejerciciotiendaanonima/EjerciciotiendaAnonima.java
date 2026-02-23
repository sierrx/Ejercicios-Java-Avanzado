
package ejerciciotiendaanonima;

import model.Descuento;
import model.Producto;


public class EjerciciotiendaAnonima {


    public static void main(String[] args) {
        
        double precioOriginal=350;
        
        Producto prod =new Producto();
        
        
        
        Descuento ClienteNuevo= new Descuento(){
            @Override
            public double aplicarDescuento(double precioOriginal) {
                
                return precioOriginal-(precioOriginal*0.05);
                
            }
        
        };
        
        Descuento ClienteFrecuente=new Descuento(){
            @Override
            public double aplicarDescuento(double precioOriginal) {
                
                return precioOriginal-(precioOriginal*0.1);
                
            }
        
        };
        
        
        Descuento ClienteVip=new Descuento(){
            @Override
            public double aplicarDescuento(double precioOriginal) {
                
                return precioOriginal-(precioOriginal*0.2);
                
            }
        
        };
            
        prod.mostrarPrecioFinal(precioOriginal,ClienteNuevo);
        
        
        
    }
    
}
