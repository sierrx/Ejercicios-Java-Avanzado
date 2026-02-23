package ejercicio3expresioneslambda;

import model.NotificadorClase;


public class Ejercicio3ExpresionesLambda {


    public static void main(String[] args) {
        
        //clases anonimas
        NotificadorClase notif= new NotificadorClase(){
            @Override
            public void enviarRecordatorio(String msje) {
                System.out.println("Recuerde que tiene clase de : "+msje);
            }
    
        };
        notif.enviarRecordatorio("Zumba");
        
        //lambdas
        NotificadorClase notif2 = (mensaje)->System.out.println("Recuerde que tiee clase de :"+mensaje);
        notif2.enviarRecordatorio("Pilates");
        
    }
    
}
