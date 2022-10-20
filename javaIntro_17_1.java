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
public class javaIntro_17_1 {
    public static void main (String[] args){
    
        Scanner reader = new Scanner(System.in);
        
        int z;
        int counter1;
        int counter2;
        int counter3;
        int counter4;
        int counter5;
                
        System.out.println("Ingrese el tamaño de su vector");
        int vectorTam = reader.nextInt();
        
        int [] vector1 = new int [vectorTam];
    
        for (z = 0; z<vector1.length; z++ ){
            vector1[z] = (int) (Math.random()*100000)+1;
        }
        
        if ()
    }
}
