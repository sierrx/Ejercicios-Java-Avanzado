
package model;


public class Producto {
    
    public void mostrarPrecioFinal(double precioOriginal, Descuento desc){
        double precioFinal=desc.aplicarDescuento(precioOriginal);
        System.out.println("El precio Final con descuento es de : "+precioFinal+"$");
    }
    
}
