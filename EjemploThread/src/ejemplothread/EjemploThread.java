
package ejemplothread;

import model.MyThread;


public class EjemploThread {


    public static void main(String[] args) {
        
        MyThread hilo = new MyThread("Hilo1");
        MyThread hilo2 = new MyThread("Hilo2");
        MyThread hilo3 = new MyThread("Hilo3");
        
        hilo.start();
        hilo2.start();
        hilo3.start();
    }
    
}
