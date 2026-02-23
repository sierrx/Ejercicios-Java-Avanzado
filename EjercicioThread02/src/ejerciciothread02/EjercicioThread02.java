package ejerciciothread02;

import model.Fabrica;
import model.Trabajador;


public class EjercicioThread02 {


    public static void main(String[] args) {
        
        Fabrica fabrica = new Fabrica();
        
        Trabajador t1 = new Trabajador("Chambeador 1", fabrica);
        Trabajador t2 = new Trabajador("Chambeador 1", fabrica);
        Trabajador t3 = new Trabajador("Chambeador 1", fabrica);
        
        t1.start();
        t2.start();
        t3.start();
        
        for (int i=0; i<10;i++) {
            fabrica.recibirTarea();
            try {
                //podemos simular un tiempo aprox entre llamada y llamada para probar
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
