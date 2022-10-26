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
public class javaIntroExtra_1 {
    public static void main (String[] args){
    
    
        Scanner reader = new Scanner(System.in);
        
        int hour1 = 0;
        int day1 = 0;
        
        
        System.out.println("Ingrese un valor en minutos a medir");
        int time1 = reader.nextInt();
        
       while (time1 > 59 ){
           if (time1 >= 1440){
           day1++;
           time1 = time1 -1440;
           }else if(time1 >= 60){
           hour1++;
           time1 = time1 -60;
           
           }
       }
       
        System.out.println("Serian " + day1 + " dia(s) y " + hour1 + " hora(s)");
    }
}
