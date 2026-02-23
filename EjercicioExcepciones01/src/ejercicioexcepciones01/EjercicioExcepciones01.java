package ejercicioexcepciones01;

import java.util.Scanner;
import model.MontoInvalidoException;

public class EjercicioExcepciones01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean vali1 = false;
        boolean vali2 = false;
        boolean vali3 = false;

        while (!vali1) {
            System.out.println("Ingrese un número de tarjeta de 16 dígitos:");
            String tarj = teclado.nextLine();

            try {
                if (tarj.length() != 16) {
                    throw new Exception("El número no contiene 16 dígitos.");
                }

                long numero = Long.parseLong(tarj);
                System.out.println("Número válido: " + numero);
                vali1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: El dato ingresado contiene caracteres no numéricos.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


        while (!vali2) {
            System.out.println("Ingrese el monto de la compra:");
            double cant = teclado.nextDouble();
            teclado.nextLine();

            try {
                if (cant <= 0) {
                    throw new MontoInvalidoException("El monto es inválido.");
                }
                System.out.println("Monto válido: " + cant+" $");
                vali2 = true;
            } catch (MontoInvalidoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (!vali3) {
            System.out.println("Ingrese su nombre:");
            String nombre = teclado.nextLine();

            try {
                if (nombre.isBlank()) { 
                    throw new IllegalArgumentException("El nombre no puede estar vacío o contener solo espacios.");
                }
                System.out.println("Nombre válido: " + nombre);
                vali3 = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }


    }
}

