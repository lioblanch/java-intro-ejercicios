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
public class ejemplo13 {
    public static void main (String[] args){
    
    Scanner reader = new Scanner (System.in);
    
        System.out.println("Por favor ingrese el tamaño del cuadrado");
        int square1 = reader.nextInt();
        
        //Linea Superior
        for (int i = 0; i<square1; i++){
            System.out.print("*");
        }
        System.out.println();
        //Centro del Cuadrado
        for (int i = 0; i<square1-2; i++){
            System.out.print("*");
            for (int j = 0; j<square1-2; j++){
            System.out.print(" ");
        }
            System.out.println("*");
        }
        
        //Linea inferior
        for (int i = 0; i<square1; i++){
            System.out.print("*");
        }
    }   
         
}
