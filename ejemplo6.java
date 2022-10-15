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
public class ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para determinar si es par o impar");
        number = reader.nextInt();
        
        if(number%2 == 0){
                System.out.println("El numero " + number + " es par");
        }else{
            System.out.println("El numero " + number + "  es impar");
        }
      
    }
    
}
