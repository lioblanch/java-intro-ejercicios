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
public class ejemplo14 {
    
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    
    int euro = 0;
    
    
        System.out.println("Ingrese la cantidad de Euros");
        euro = reader.nextInt();
                      
        cambio(euro);
    }
    
    public static void cambio(int moneda){
        
        System.out.println("El cambio de divisas es");
        
        System.out.println((moneda* 0.86) + " libras son " + moneda + " Euros");
        System.out.println((moneda* 1.28611) + " dolares son " + moneda + " Euros");
        System.out.println((moneda* 129.852) + " yenes son " + moneda + " Euros");
    
        
        
    }                
}
