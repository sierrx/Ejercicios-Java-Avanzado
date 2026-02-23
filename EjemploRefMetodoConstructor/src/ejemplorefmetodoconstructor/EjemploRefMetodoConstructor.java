
package ejemplorefmetodoconstructor;

import java.util.function.BiFunction;
import model.Persona;


public class EjemploRefMetodoConstructor {


    public static void main(String[] args) {
        //referencia al constructor
        
        BiFunction<String, Integer,Persona> constructor = Persona::new;
        
        
        Persona pers = constructor.apply("Angel", 23);
        System.out.println(pers);
        
        //modo normal
        Persona pers1 = new Persona("Angel",23);
        System.out.println(pers1);
    }
    
}
