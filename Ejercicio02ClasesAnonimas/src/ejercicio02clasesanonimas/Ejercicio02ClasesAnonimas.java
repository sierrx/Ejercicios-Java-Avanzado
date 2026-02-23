package ejercicio02clasesanonimas;

import java.util.Scanner;
import model.PrecioReserva;
import model.Reserva;


public class Ejercicio02ClasesAnonimas {


    public static void main(String[] args) {
        
        Reserva reserva = new Reserva();
        Scanner teclado=new Scanner(System.in);
        double precio=0;
        int c=0;
        
        System.out.println("Bienvenido este son los precios de las habitaciones por noche");
        System.out.println("1-   500 sencilla");
        System.out.println("2-   800 Doble");
        System.out.println("3-   1000 Suit");
        int select= teclado.nextInt();

        switch (select){
            case 1:
               precio=500;
               break;
            case 2:
                precio=800;
                break;
            case 3:
                precio=1000;
                break;
            default:
                System.out.println("Ingreso una opcion no valida");
        
        }
        
        PrecioReserva membresia = new PrecioReserva(){
            @Override
            public double calcularPrecio(double precio) {
                return precio=precio*0.9;
            }
        };
        
        PrecioReserva tempBaja = new PrecioReserva(){
            @Override
            public double calcularPrecio(double precio) {
                return precio=precio*0.8;
            }
        };
        
        PrecioReserva ultHora = new PrecioReserva(){
            @Override
            public double calcularPrecio(double precio) {
                return precio=precio*0.9;
            }
        };
        
        System.out.println("Usted cuenta con membresía? 1 para si cualquier otro numero para no");
        int mem =teclado.nextInt();
        
        if(mem==1){
            reserva.realizarReserva(precio, membresia);
            precio=precio;
            
        }
        else{
            precio=precio;
        }
        
        System.out.println("Ingrese el numero de mes");
        int nm= teclado.nextInt();
        
        switch(nm){
            case 1:
                System.out.println("Temporada Alta");
                c=1;
                break;
            case 2:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 3:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 4:
                System.out.println("Temporada Alta");
                c=1;
                break;
            case 5:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 6:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 7:
                System.out.println("Temporada Alta");
                c=1;
                break;
            case 8:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 9:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 10:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 11:
                System.out.println("Temporada Baja");
                c=0;
                break;
            case 12:
                System.out.println("Temporada Alta");
                c=1;
                break;
            default:
                System.out.println("Ingreso un mes no valido");
        }
        
        if(c==1){
            reserva.realizarReserva(precio, tempBaja);
            precio=precio;
        }
        else{
            precio=precio;
        }
        
        System.out.println("ingrese la cantidad de dias posteriores a la fecha actual sera su reserva");
        
        int days = teclado.nextInt();
        
        if(days>7){
            reserva.realizarReserva(precio, ultHora);
        }
        else{
            precio=precio;
        }
        
        System.out.println("El precio de su final de su reserva es de : $"+precio);
    }
    
}
