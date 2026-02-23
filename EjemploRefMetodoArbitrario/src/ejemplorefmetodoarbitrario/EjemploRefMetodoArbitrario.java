
package ejemplorefmetodoarbitrario;

import java.util.ArrayList;
import java.util.List;
import model.Persona;

public class EjemploRefMetodoArbitrario {


    public static void main(String[] args) {
        
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Andrea"));
        listaPersonas.add(new Persona("Anna"));
        listaPersonas.add(new Persona("Paola"));
        //Uso de referencia
        listaPersonas.forEach(Persona::saludar);
        
        //codigo normal
        for(Persona per: listaPersonas){
            per.saludar();
        }
        
    }
    
}
