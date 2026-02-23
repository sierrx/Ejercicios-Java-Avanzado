
package ejemploprogfuncional;

import java.util.ArrayList;
import java.util.List;


public class EjemploProgFuncional {


    public static void main(String[] args) {
        List<Integer>listaNumeros= new ArrayList<>();
        listaNumeros.add(23);
        listaNumeros.add(3);
        listaNumeros.add(223);
        
        System.out.println("Metodo Clasico");
        multiplicarNumeros(listaNumeros);
        
        
        System.out.println("Metodo Lambdas");
        listaNumeros.forEach(numero -> System.out.println(numero*2));
        
        
        
        
    }

    private static void multiplicarNumeros(List<Integer> listaNumeros) {
        for(int numero:listaNumeros){
            System.out.println(numero*2);
        }
    }
    
}
