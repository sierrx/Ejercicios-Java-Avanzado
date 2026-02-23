package ejerciciointegradorlambdasystrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.Vehiculo;


public class EjercicioIntegradorLambdasYStrings {


    public static void main(String[] args) {
        List<Vehiculo> carros = new ArrayList<>();
        carros.add(new Vehiculo("Vado", "Fiesta", 1000));
        carros.add(new Vehiculo("Vado", "Enfocar", 1200));
        carros.add(new Vehiculo("Vado", "Explorador", 2500));
        carros.add(new Vehiculo("Fíat", "Uno", 500));
        carros.add(new Vehiculo("Fíat", "Cronos", 1000));
        carros.add(new Vehiculo("Fíat", "Turín", 1250));
        carros.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        carros.add(new Vehiculo("Chevrolet", "Girar", 2500));
        carros.add(new Vehiculo("Toyota", "Corola", 1200));
        carros.add(new Vehiculo("Toyota", "Fortuna", 3000));
        carros.add(new Vehiculo("Renault", "Logan", 950));
        
        //Metodo Sort ordenados de menor a mayor
        
        List<Vehiculo> ordMenorAMayor = carros.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        
        System.out.println("El orden de menor a mayor de los carros es: ");
        ordMenorAMayor.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        
        //ordenados por marca y precio
        List<Vehiculo> ordMarcaYPrecio = carros.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparing(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println("Carros ordenados por tipo y costo");
        ordMarcaYPrecio.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        //ordenados menores a 1000
        List<Vehiculo> menoresdemil=carros.stream()
                .filter(serv->serv.getCosto()<1000)
                .collect(Collectors.toList());
        
        System.out.println("Carros por debajo de 1000");
        menoresdemil.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        //ordenados mayores a 1000
        List<Vehiculo> mayoresdemil=carros.stream()
                .filter(serv->serv.getCosto()>1000)
                .collect(Collectors.toList());
        
        System.out.println("Carros por debajo de 1000");
        mayoresdemil.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        //costo promedio de los carros
        
        double promedioCostosCarros =carros.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0);
        
        System.out.println("El promedio del costo de los carros es: $ "+promedioCostosCarros);
        System.out.println("----------------------------------------------");
        
        //filtro para autos Chevrolet y fiat
        List<Vehiculo> chevAndFiat=carros.stream()
                .filter(marca -> marca.getMarca().equals("Chevrolet")||marca.getMarca().equals("Fíat"))
                .collect(Collectors.toList());
        System.out.println("LOs carros de la marca Chevrolet y Fíat son: ");
        chevAndFiat.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        
        //Autos cuyo modelo tienen una letra c
        List<Vehiculo> tienenUnaC=carros.stream()
                .filter(coche->coche.getMarca().toLowerCase().contains("c"))
                .collect(Collectors.toList());
        
        System.out.println("Los carros que tienen una letra c son :");
        tienenUnaC.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        
        List<Vehiculo> ordMenorAMayorReversed = carros.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto).reversed())
                .collect(Collectors.toList());
        
        System.out.println("El orden de mayor a menor de los carros es: ");
        ordMenorAMayorReversed.forEach(System.out::println);
        System.out.println("----------------------------------------------");
        


    }
    
}
