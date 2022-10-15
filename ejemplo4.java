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
public class ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int celsius = 0;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce los grados celsius a convertir a farenheit");
        celsius = reader.nextInt();
        
        float farenheit = 32 + (9*celsius / 5);
        
        System.out.println("Los grados celsius ingresados son" + " " + celsius + " En farenheit son " + farenheit);
        
        
    }
    
}
