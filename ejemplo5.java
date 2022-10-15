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
public class ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        number = reader.nextInt();
        
        int number1 = number + number;
        
        int number2 = number1 + number; 
               
        System.out.println("El doble de su numero es " + number1 +" " 
        + "El triple de su numero es " + number2 + " LA raiz de su numero es " 
        + Math.sqrt(number));
        
        
    }
    
}
