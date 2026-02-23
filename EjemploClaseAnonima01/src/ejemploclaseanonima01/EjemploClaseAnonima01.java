
package ejemploclaseanonima01;

import model.Vehiculo;



public class EjemploClaseAnonima01 {


    public static void main(String[] args) {
        
        new Vehiculo(){
            private int numPasajeros;
            
            public void conducir(){
                System.out.println("Estoy manejando un carro");
            }
        
        }.conducir();
        
        
    }
    
 }
