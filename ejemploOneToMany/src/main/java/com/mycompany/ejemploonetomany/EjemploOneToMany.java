package com.mycompany.ejemploonetomany;

import java.util.ArrayList;
import java.util.List;
import model.Carrito;
import model.Item;
import persistencia.ControladoraPersistencia;


public class EjemploOneToMany {

    public static void main(String[] args) {
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        ArrayList<Item> listaItems=new ArrayList<Item>();
        
        listaItems.add(new Item (12L,"Arroz", null));
        listaItems.add(new Item (13L,"Fideo", null));
        
        Carrito carrito = new Carrito(1L,listaItems);
        
        for (Item i:listaItems){
            i.setCarrito(carrito);
        }
        
        controlPersis.crearCarrito(carrito);
        
        
        
    }
}
