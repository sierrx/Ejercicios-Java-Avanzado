package model;


public class Reserva {
    
    public void realizarReserva(double precioOriginal, PrecioReserva reser){
        double precioFinalDeLaReserva=reser.calcularPrecio(precioOriginal);
        
    }
}
