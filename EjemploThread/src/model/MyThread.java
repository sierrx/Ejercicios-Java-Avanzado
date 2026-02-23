
package model;


public class MyThread extends Thread {
    
    private String nombre;

    public MyThread(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run (){
        for(int i =0;i<5;i++){
            System.out.println("estoy en la vuelta"+i+" soy el hilo : "+nombre);
        }
    }
    
}
