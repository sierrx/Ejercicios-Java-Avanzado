package ejercicio04expresioneslambda;

import model.NotificadorLibro;


public class Ejercicio04ExpresionesLambda {


    public static void main(String[] args) {
        //foma clasica
        NotificadorLibro notiflib = new NotificadorLibro(){
            @Override
            public void enviarMensaje(String mensaje) {
                System.out.println("el libro "+mensaje+" ahora se encuentra disponible");
            }
        
        };
        notiflib.enviarMensaje("La guia del ligue de Jordi Rosado");
        
        //Usando Lambdas
        NotificadorLibro notiflib2 =(mensaje)->System.out.println("el libro "+mensaje+" ahora se encuentra disponible");
        notiflib2.enviarMensaje("Quiobule con ");
    }
    
}
