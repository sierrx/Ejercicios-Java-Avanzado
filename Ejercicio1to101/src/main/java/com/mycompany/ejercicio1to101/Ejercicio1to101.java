
package com.mycompany.ejercicio1to101;

import model.Director;
import model.Oficina;
import persistencia.ControladoraPersistencia;


public class Ejercicio1to101 {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        
        Director director = new Director(13432l, "Juan", "Perez", null);
        Oficina oficina;
        oficina = new Oficina(34l, "Marie", 32, director);
        
        director.setOficina(oficina);
        controlPersis.crearOficina(oficina);
    }
}
