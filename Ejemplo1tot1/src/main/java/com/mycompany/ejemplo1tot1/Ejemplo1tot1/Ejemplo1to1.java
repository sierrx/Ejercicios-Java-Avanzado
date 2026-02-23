package com.mycompany.ejemplo1tot1.Ejemplo1tot1;

import model.Carro;
import model.Propietario;
import persistencia.ControladoraPersistencia;


public class Ejemplo1to1 {
    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        Propietario prop=new Propietario();
        Carro carro=new Carro();
        prop.setCarro(carro);
        
        
        controlPersis.crearPropietario(prop);
        
    }
}
