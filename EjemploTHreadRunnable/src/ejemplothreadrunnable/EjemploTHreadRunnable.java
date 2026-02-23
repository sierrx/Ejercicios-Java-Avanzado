package ejemplothreadrunnable;

import model.MyThread;


public class EjemploTHreadRunnable {


    public static void main(String[] args) {
        
        Runnable miRunnable = new MyThread();
        
        Thread hilo= new Thread(miRunnable);
        hilo.start();
        
        Thread hilo2= new Thread(miRunnable);
        hilo.start();
        
        Thread hilo3= new Thread(miRunnable);
        hilo.start();
        
        
    }
    
}
