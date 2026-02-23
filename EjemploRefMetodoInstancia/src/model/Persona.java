
package model;

public class Persona {
    String nombre;
    
    //metodo instancia
    
    public void saludar(){
        System.out.println("Hola mi nombre es "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
