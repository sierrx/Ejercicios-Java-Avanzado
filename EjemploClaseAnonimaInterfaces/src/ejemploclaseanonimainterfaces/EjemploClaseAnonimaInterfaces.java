
package ejemploclaseanonimainterfaces;

import model.Saludo;


public class EjemploClaseAnonimaInterfaces {


    public static void main(String[] args) {
        
        new Saludo (){
            @Override
            public void saludar() {
                System.out.println("Hola saludando desde clase anonima");
            }
            
        };
        
        sal.saludar();
    }
    
}
