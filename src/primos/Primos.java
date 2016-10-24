/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Primos {
    
    //Devuelve true si es primo
    public static boolean CompruebaPrimo(int num){
        boolean primo = true;
        
        for (int i = 2; i<num; i++){        
            if ((num % i)==0){                
                primo = false;
                i=num+1;
            }        
        } 
        
        return primo;
    }
    public static int SiguientePrimo(int num){
        int primo = 0;
        boolean bandera = true;
        for (int i = (num+1); bandera == true; i++){
            if (CompruebaPrimo(i)){
                bandera = false;
                primo = i;
            }
        }
        return primo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;        
        boolean bandera = true;
        Scanner leer = new Scanner(System.in);
        
        while (bandera){
            System.out.println("Dime un número para comprobar si es primo");
            num = leer.nextInt();
            
            if (CompruebaPrimo(num)){
                System.out.println("El número " + num + " es primo");
                System.out.println("El siguente primo es: " + SiguientePrimo(num));
            }else{
                System.out.println("El número " + num + " no es primo");
                System.out.println("El siguente primo es: " + SiguientePrimo(num));
            }
            
            if (num == 0){
                bandera = false;
            }
        }        
    }    
}
