package ejemplorefmetodoestatico;

import java.util.function.Function;

public class EjemploRefMetodoEstatico {


    public static void main(String[] args) {
       
        //entero a string
        
        //(int num)->String.valueOf(num);
        
        //referencia a metodos
        //String::ValueOf;
        
        Function<Integer,String>convertidor = (num)->String.valueOf(num);
        
        //Function<Integer,String>convertidor = String::ValueOf;
        System.out.println("El valor de salida es : "+convertidor.apply(35));
    }
    
}
