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
public class javaIntroExtra_2 {
    public static void main (String[] args){
    
        Scanner reader = new Scanner (System.in);
        
        int a, b, c, d;
        
        System.out.println("Ingrese el primer valor");
        a = reader.nextInt();
        System.out.println("Ingrese el segundo valor");
        b = reader.nextInt();
        System.out.println("Ingrese el tercer valor");
        c = reader.nextInt();
        System.out.println("Ingrese el cuarto valor");
        d = reader.nextInt();
        
        
        System.out.println("a" + a + "b" + b + "c" + c + "d" + d);
        
        aux1(a,b,c,d);
                
    }
    
  
    
    
    public static void aux1 (int w, int x, int y,int z){
    
        int aux1 = 0;
        
        aux1 = x;
        x = y;
        y = w;
        w = z;
        z = aux1;
        
        System.out.println("a" + w + "b" + x + "c" + y +"d" + z);
        
    }
}
