package ejemplorefmetodoinstancia;

import model.Persona;


public class EjemploRefMetodoInstancia {


    public static void main(String[] args) {
        
        Persona pers = new Persona();
        pers.setNombre("Angel");
        
        //referencia de metodos
        Runnable saludo = pers::saludar;
        saludo.run();
        
        //forma normal
        pers.saludar();
        
    }
    
}
