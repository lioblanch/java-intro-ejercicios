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
public class javaIntroExtra_5 {
    public static void main (String[] args){
    
    Scanner reader = new Scanner (System.in);
    
        System.out.println("Ingrese el tipo de codigo a procesar");
        String option1 = reader.next();
        
        System.out.println("Ingrese el costo del tratamiento");
        double cost1 = reader.nextDouble();
        switch (option1){
        
            case "a" :
                cost1 = cost1 * .5;
                System.out.println("El valor a pagar por ser socio tipo "
                        + "A es " +  cost1);
               break;
            case "b" :
                cost1 = cost1 * .65;
                System.out.println("El valor a pagar por ser socio tipo "
                        + "A es " +  cost1);
               break;
            case "c" :
                cost1 = cost1 * 1;
                System.out.println("El valor a pagar por ser socio tipo "
                        + "A es " +  cost1);
               break;          
            default:
                System.out.println("Ingrese un codigo de socio valido");
        }
    
    }
}
