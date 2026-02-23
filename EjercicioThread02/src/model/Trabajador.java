package model;


public class Trabajador extends Thread{
    private String nombre;
    private Fabrica chamba;

    public Trabajador(String nombre, Fabrica chamba) {
        this.nombre = nombre;
        this.chamba = chamba;
    }
    
    @Override
    public void run() {
        while (chamba.isActive()) {
        String tarea = chamba.asignarTarea(); // Asigna una llamada
            
            System.out.println("\n" + nombre + " está ensamblando y controlando el producto " );
            try {
                Thread.sleep(2000); // Simula el tiempo de atención
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + " ha ensamblado el producto ");
        }
    }
}
