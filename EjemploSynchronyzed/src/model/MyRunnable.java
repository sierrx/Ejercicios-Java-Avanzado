package model;


public class MyRunnable implements Runnable{
    
    ClaseSincronizada ejemplo = new ClaseSincronizada();
    
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("estoy en la vuelta"+i);
            ejemplo.incrementar();
        }
    }
    
    
    
}
