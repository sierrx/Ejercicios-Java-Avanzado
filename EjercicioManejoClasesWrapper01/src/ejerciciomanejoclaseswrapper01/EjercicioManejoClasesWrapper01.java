package ejerciciomanejoclaseswrapper01;

import java.util.ArrayList;
import java.util.Scanner;
import model.Animal;


public class EjercicioManejoClasesWrapper01 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<>();
        boolean bucle = true;

        System.out.println("Bienvenido a la aplicación de gestión veterinaria.");
        while (bucle) {
            try {

                System.out.print("Ingrese el nombre del animal: ");
                String nombre = teclado.nextLine();
                System.out.print("Ingrese el peso del animal: ");
                String pesoTexto = teclado.nextLine();

                Double peso = Double.parseDouble(pesoTexto);
                animales.add(new Animal(nombre, peso));

                System.out.print("Desea ingresar otro animal? s para si n para no: ");
                String respuesta = teclado.nextLine();
                if (!respuesta.equalsIgnoreCase("s")) {
                    bucle = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("error con el peso ingrese nuevamente");
            }
        }


        System.out.println("Lista de animales regisrados");
        animales.forEach(Animal::mostrarInfo);
    }
    
}
