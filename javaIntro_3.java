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
public class javaIntro_3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String phrase = reader.nextLine();
        
        System.out.println(phrase);
        
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
    }
    
}
