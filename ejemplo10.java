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
public class ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limit = 0;
        int number1 = 0;
        int counter = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese un limite");
        limit = reader.nextInt();
        
        do {
            System.out.println("Ingrese valores a sumar");
            number1 = reader.nextInt();  
            counter = number1 + counter;
        }while(counter<= limit);
        
        System.out.println("Supero su limite");
    }
    
}
