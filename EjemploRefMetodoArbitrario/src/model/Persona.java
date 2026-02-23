
package model;


public class Persona {
    String Nombre;

    public Persona() {
    }

    public Persona(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     
   public void saludar(){
       System.out.println("Hola soy"+Nombre);
   }
}
