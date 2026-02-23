package model;


public class Animal {
    String nombre;
    double peso;
    
    public Animal(String nombre, Double peso) {
        
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", peso=" + peso + '}';
    }
    
    public void mostrarInfo() {
        
        System.out.println("Animal: " + nombre + ", Peso: " + peso + " kg");
    }

}
