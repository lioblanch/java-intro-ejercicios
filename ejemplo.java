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
public class ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        
        Scanner reader = new Scanner(System.in);
                
          
        System.out.println("Introduce el primero numero");
        numero1 = reader.nextInt();

        System.out.println("Introduce el segundo numero");
        numero2 = reader.nextInt();

        int resultado = numero1 + numero2;

        System.out.println("la suma de los valores " + numero1 + " + " + numero2 +" = " + resultado);
    }
    
}
