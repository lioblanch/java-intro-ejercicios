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
public class javaIntroExtra_4 {
    public static void main (String[] args){
    Scanner reader = new Scanner (System.in);
    
        System.out.println("Ingrese un numero del uno al 10");
        
        int number1 = reader.nextInt();
        
        switch(number1){
            case 1:
                System.out.println("El numero " + number1 + " En romano es I");
                break;
            case 2:
                System.out.println("El numero " + number1 + " En romano es II");
                break;
            case 3:
                System.out.println("El numero " + number1 + " En romano es III");
                break;
            
            case 4:
                System.out.println("El numero " + number1 + " En romano es IV");
                break;
            
            case 5:
                System.out.println("El numero " + number1 + " En romano es V");
                break;
            
            case 6:
                System.out.println("El numero " + number1 + " En romano es VI");
                break;
            case 7:
                System.out.println("El numero " + number1 + " En romano es VII");
                break;
            case 8:
                System.out.println("El numero " + number1 + " En romano es VIII");
                break;
            case 9:
                System.out.println("El numero " + number1 + " En romano es IX");
                break;
            case 10:
                System.out.println("El numero " + number1 + " En romano es X");
                break;
            default :
                System.out.println("El numero esta fuera del rango");

        
        
        }
    
    }
}
