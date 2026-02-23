
package ejemploexceptions;

import java.util.Scanner;
import model.ExceptionDatoIncorrecto;


public class EjemploExceptions {


    public static void main(String[] args) throws ExceptionDatoIncorrecto {
        
        int dato=0;
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingrese un dato entre 1 y 10");
        dato= teclado.nextInt();
        
        if(dato<=0 || dato>=11){
            
            throw new ExceptionDatoIncorrecto("Ingreso un valor no valido");
            
        }
    }
    
}
