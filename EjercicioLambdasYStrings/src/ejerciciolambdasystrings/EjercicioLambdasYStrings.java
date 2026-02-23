package ejerciciolambdasystrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.ServicioVeterinario;


public class EjercicioLambdasYStrings {


    public static void main(String[] args) {
        
        List<ServicioVeterinario> servicios = new ArrayList<>();
        servicios.add(new ServicioVeterinario("Consulta general", 500));
        servicios.add(new ServicioVeterinario("Vacunación", 300));
        servicios.add(new ServicioVeterinario("Desparasitación", 200));
        servicios.add(new ServicioVeterinario("Cirugía menor", 1500));
        servicios.add(new ServicioVeterinario("Consulta general", 400));
        servicios.add(new ServicioVeterinario("Emergencia", 2000));
        servicios.add(new ServicioVeterinario("Vacunación", 250));
        servicios.add(new ServicioVeterinario("Desparasitación", 180));
        servicios.add(new ServicioVeterinario("Consulta general", 350));
        
        //ordena por costo de menor a mayor
        
        List<ServicioVeterinario> ordenadosPorCosto = servicios.stream()
            .sorted(Comparator.comparingDouble(ServicioVeterinario::getCosto))
            .collect(Collectors.toList());
        System.out.println("Servicios ordenados por costo de menor a mayor");
        ordenadosPorCosto.forEach(System.out::println);
        System.out.println("");
        
        //ordenar tipo de servicio y luego costo en caso de servicio repetido
        List<ServicioVeterinario> ordenadosPorServicio=servicios.stream()
                .sorted(Comparator.comparing(ServicioVeterinario::getTipo)
                        .thenComparing(ServicioVeterinario::getCosto))
                .collect(Collectors.toList());
        System.out.println("Servicios ordenados por tipo y costo");
        ordenadosPorServicio.forEach(System.out::println);
        System.out.println("");
        //lista de servicios >500
        
        List<ServicioVeterinario> menoresdemilqui=servicios.stream()
                .filter(serv->serv.getCosto()<500)
                .collect(Collectors.toList());
        
        System.out.println("Servicios menores a 500");
        menoresdemilqui.forEach(System.out::println);
        System.out.println("");
        //lista de servicios <500
        
        List<ServicioVeterinario> mayoresdemilqui=servicios.stream()
                .filter(serv->serv.getCosto()>500)
                .collect(Collectors.toList());
        
        System.out.println("Servicios mayores a 500");
        mayoresdemilqui.forEach(System.out::println);
        System.out.println("");
        //promedio de costos de los servicios
        double promedioCostos =servicios.stream()
                .mapToDouble(ServicioVeterinario::getCosto)
                .average()
                .orElse(0);
        
        System.out.println("El promedio de los servicios es "+promedioCostos);
     
                
        
    }
    
}
