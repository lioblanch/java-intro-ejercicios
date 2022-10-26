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
public class javaIntro_16 {
    
   public static void main (String[] args){
   
       Scanner reader = new Scanner(System.in);
       int counter = 0;
       int j ;
       System.out.println("Ingrese el tamaño de su vector");
       int vectorTam = reader.nextInt();
   
       int [] vector1 = new int [vectorTam];
       
       randomly(vector1);
       buscador(vector1);
   }


public static void randomly (int[] x){
        int aleatorio = (int) (Math.random()*20)+1;
        int z;
        int randomly;
        
        for (z = 0; z<x.length; z++ ){
            x[z] = (int) (Math.random()*20)+1;
        }
            
         for (z = 0; z<x.length; z++ ){
           System.out.print(x[z]);
             System.out.print(" ");
        }
         System.out.println(" ");
         
}

public static void buscador(int[] y){
    
    int counter = 0;
    Scanner reader = new Scanner(System.in);
System.out.println("Ingrese un valor a buscar en el arreglo");
       int value = reader.nextInt();
       
       for (int j = 0; j< y.length; j++){
       
          if (value == y[j]){
              counter++; 
          } 
         
       }
        System.out.println("EL valor " + value + " aparece " + counter +" veces en el arreglo");

}

}


