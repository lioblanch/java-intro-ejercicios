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
public class javaIntro_15 {
    public static void main (String[] args){
    
        Scanner reader = new Scanner (System.in);
        
     
            counter();

      
    }
            
   
    
    public static void counter(){
     int i;
     int [] a = new int [100];   
       for (i = 0; i < 100; i++){
       a[i]= i+1;
        
      }
       for (i = 0; i < 100; i++){
           System.out.println(a[i]);
        
      }
       
    }
    }

