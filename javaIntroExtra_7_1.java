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
public class javaIntroExtra_7_1 {
    public static void main (String[] args){
    
    Scanner reader = new Scanner (System.in);
        
    int valor1 = 0;
    int valor2 = 0;
      int counter = 0;
        System.out.println("Ingrese el dividendo");
        valor1  = reader.nextInt();
        
        System.out.println("Ingrese el divisor");
        valor2 = reader.nextInt();
        
        do{
      
        if(valor1 < valor2){
            System.out.println("El dividendo debe ser mayor que el divisor");
            break;
        }
            System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2));
        valor1 = valor1 - valor2;
        
        counter++;
        
        }while (valor1 > valor2);
        
        
        System.out.println("El residuo es " + valor1 + " el cociente es " + counter);
        }
        
    }
    
    

