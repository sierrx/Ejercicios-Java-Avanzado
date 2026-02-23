package ejemplosynchronyzed;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.MyRunnable;

public class EjemploSynchronyzed {


    public static void main(String[] args) {
        
        
        Thread hilo1 = new Thread(new MyRunnable());
        
        Thread hilo2 = new Thread (new MyRunnable());

        hilo1.start();
        hilo2.start();


            try {
                hilo1.join();
                hilo2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(EjemploSynchronyzed.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
            

        
        
    
}
