package ejemplostreams;

import java.util.Arrays;
import java.util.List;


public class EjemploStreams {


    public static void main(String[] args) {
        // lista paises
        
        List<String> paises=Arrays.asList(
        "España","Mexico","Argentina","Francia","Italia","alemania","Portugal",
        "Chile","Colombia","Peru"        
        );
        
        //filtro
        paises.stream()
            .filter(pais->pais.toLowerCase().contains("a"))
            .forEach(System.out::println);
    }
    
}
