/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;
import java.util.*;
/**
 *
 * @author pc
 */
public class javaIntroExtra_8 {
    public static void main (String [] args){
    
        Scanner reader = new Scanner (System.in);
        
        int counter = 0;
        int valor = 0;
        int par = 0;
        int impar = 0;
       do{
       
           System.out.println("ingrese un valor entero mayor que 0");
           valor = reader.nextInt();
           
           if (valor < 0){
               System.out.println("Ingrese un valor positivo");
           }
           if (valor %2==0){
           par ++;
           }else{
           impar++;
           }
           
       
           counter++;
       }while(valor%5 != 0);
        
        System.out.println("La cantidad de numeros leidos fue " +  counter);
        System.out.println("La cantidad de valores pares fue " + par);
        System.out.println("La cantidad de valores impares fue " + impar);
    }
}
