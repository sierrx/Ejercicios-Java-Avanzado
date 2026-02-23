package model;

import java.util.ArrayList;
import java.util.List;

public class Fabrica  {
    
    private List<String> listaChamba; // Lista de llamadas
    private int numChamba; // Identificador de llamada
    private boolean isActive = true; // Variable que controla si el centro está activo o no
    
    public Fabrica(){
       
        listaChamba = new ArrayList<>();
        numChamba = 1; // Inicializa el ID de las llamadas
    
    }
    
    public synchronized void recibirTarea() {
        String chamba = "La tarea " + numChamba;
        listaChamba.add(chamba);
        System.out.println("\n" + chamba + " ha sido recibida.");
        numChamba++;
        notifyAll(); // Notifica a los agentes de que hay una nueva llamada
    }
    
    public synchronized String asignarTarea() {
        while (listaChamba.isEmpty()) {
            try {
                wait(); // Espera si no hay llamadas
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return listaChamba.remove(0); // Elimina de la lista la primera llamada y la devuelve
        
    }
    
    public synchronized boolean isActive() {
        return isActive;
    }

    public List<String> getListaChamba() {
        return listaChamba;
    }

    public void setListaChamba(List<String> listaChamba) {
        this.listaChamba = listaChamba;
    }

    public int getNumChamba() {
        return numChamba;
    }

    public void setNumChamba(int numChamba) {
        this.numChamba = numChamba;
    }
    
    
    
}
