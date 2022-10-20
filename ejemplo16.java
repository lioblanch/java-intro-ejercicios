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
public class ejemplo16 {
   public static void main (String[] args){
   
       Scanner reader = new Scanner(System.in);
       
       
       System.out.println("Ingrese el tamaño de su vector");
       int vectorTam = reader.nextInt();
   
       int [] vector1 = new int [vectorTam];
       
       randomly(vector1);
   }


public static int randomly (int x[]){
        int aleatorio = (int) (Math.random()*20)+1;
        int z;
        int randomly;
        
        for (z = 0; z<x.length; z++ ){
            x[z] = (int) (Math.random()*20)+1;
        }
            
         for (z = 0; z<x.length; z++ ){
           System.out.print(x[z]);
             
        }
         System.out.print(" ");
         return 0;
}



}






