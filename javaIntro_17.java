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
public class javaIntro_17 {
   public static void main (String[] args){
   
       Scanner reader = new Scanner(System.in);
       int counter = 1;
       int j ;
       int i ;
       System.out.println("Ingrese el tamaño de su vector");
       int vectorTam = reader.nextInt();
   
       int [] vector1 = new int [vectorTam];
              
       randomly(vector1);
      
       int aux;
       for (j = 0; j<vector1.length; j++){
           aux = vector1[j];
           while (vector1[j]>= 10){
               vector1[j] = vector1[j]/10;
               counter++;
               
           }   
           System.out.println(" el numero " + aux + " Tiene " + counter +" Digitos");

           counter=1;
   }
   }


public static void randomly (int[] x){
        int aleatorio = (int) (Math.random()*20)+1;
        int z;
        int randomly;
        
        for (z = 0; z<x.length; z++ ){
            x[z] = (int) (Math.random()*100000)+1;
        }
         for (z = 0; z<x.length; z++ ){
           System.out.print(x[z]);
             System.out.print(" ");
        }
         System.out.println(" ");
            
         
         
}


}


