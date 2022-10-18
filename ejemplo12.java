/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class ejemplo12 {
    public static void main (String[] args){    
        
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("--------------");
        System.out.println("Ingrese un valor de RS232");
        System.out.println("Recuerde que debe tener unicamente 5 caracteres");
        System.out.println("El ´primer caracter debe ser x y el ultimo o");
        System.out.println("Ingrese la cadena");
        String word1;
        word1 = reader.next();
       
        int counter = 0;
        int counter1 = 0;
     
        while(!word1.equals("&&&&&")){
         int wordSize = word1.length();
        
        if((word1.substring(0,1).equalsIgnoreCase("x"))&& 
                (word1.endsWith("o"))&& (wordSize == 5)){
            counter = counter + 1;
        }else{
            counter1 = counter1 +1;
        }
        
        System.out.println("Ingrese nuevamente la cadena");
        word1 = reader.next();
        }
        
        System.out.println("Cadenas Correctas: " + counter);
        System.out.println("Cadenas Correctas: " + counter1);
    }
     
}