
package ejemplointerfacesfuncionales;

import model.Mensajero;


public class EjemploInterfacesFuncionales {

   
    public static void main(String[] args) {
        
        Mensajero mensaje =new Mensajero(){
            @Override
            public void emitirMensaje(String nombre) {
                System.out.println("Hola "+nombre+" desde clase anonima");
            }
            
        };
        
        
        
        Mensajero mensajeLambda=(nombre) -> System.out.println("Hola desde lambda");
        mensajeLambda.emitirMensaje("Angel");
    }
    
}
