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
public class javaIntro_18 {
    public static void main(String[] args){
    
        Scanner reader = new Scanner(System.in);
        
        int[] [] matriz1 = new int [4][4];
        int[] [] matriz2 = new int [4][4];
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++ ){
               
              matriz1[i][j] = (int) (Math.random()*9)+1; 
              matriz2[j][i] = matriz1[i][j];
            }
            
        }
        
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++ ){
               
                System.out.print(matriz1[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("  ");
        System.out.println("  ");
        
        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++ ){
               
                System.out.print(matriz2[i][j]);
            }
            System.out.println(" ");
        }
       
    }
}
