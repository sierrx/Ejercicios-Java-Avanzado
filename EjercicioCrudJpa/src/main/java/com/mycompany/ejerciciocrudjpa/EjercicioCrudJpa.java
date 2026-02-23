package com.mycompany.ejerciciocrudjpa;

import java.util.Scanner;
import model.MontoInvalidoException;
import persistencia.ControladoraPersistencia;


public class EjercicioCrudJpa {

    public static void main(String[] args) {
        
        ControladoraPersistencia ControlPersis = new ControladoraPersistencia();
        Scanner teclado = new Scanner(System.in);
        
        String nombre = null;
        boolean nombreValido = false;

        while (nombreValido != true) {

            try {
                System.out.println("Ingrese el nombre del producto");
                nombre = teclado.nextLine();
                //validar si monto es correcto
                validarNombre(nombre);
                nombreValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }
        
        double montoPrecio = 0.0;
        boolean montoValido = false;

        while (montoValido != true) {

            try {
                System.out.println("Ingrese el monto de la compra");
                montoPrecio = Double.parseDouble(teclado.nextLine());
                //validar si monto es correcto
                validarMonto(montoPrecio);
                montoValido = true;
            } catch (MontoInvalidoException e) {
                System.out.println(e.getMessage());
            }

        }
        
        
        
        
        

        
    }

    private static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
                throw new IllegalArgumentException("El nombre no puede estar vacío");
            }
    }

    private static void validarMonto(double montoPrecio) throws MontoInvalidoException{
        
        if (montoPrecio <= 0) {
            throw new MontoInvalidoException("El monto ingresado es inválido. Debe ser mayor a 0");
        }
        
    }
        
    
}

    

    

