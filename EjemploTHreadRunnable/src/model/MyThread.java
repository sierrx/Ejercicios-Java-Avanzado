/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class MyThread implements Runnable {

    @Override
    public void run() {
        
        for(int i =0;i<5;i++){
            System.out.println("estoy en la vuelta"+i+" soy el hilo : ");
        }
   
    }
    
}
