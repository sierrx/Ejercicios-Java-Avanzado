
package model;


public class Cliente {
    
    int numTatjeta;
    double cantidad;
    String nombre;

    public Cliente() {
    }

    public Cliente(int numTatjeta, double cantidad, String nombre) {
        this.numTatjeta = numTatjeta;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getNumTatjeta() {
        return numTatjeta;
    }

    public void setNumTatjeta(int numTatjeta) {
        this.numTatjeta = numTatjeta;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
