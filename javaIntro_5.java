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
public class javaIntro_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        number = reader.nextInt();
        
        int number1 = number + number;
        
        int number2 = number1 + number; 
               
        System.out.println("El doble de su numero es " + number1 +" " 
        + "El triple de su numero es " + number2 + " LA raiz de su numero es " 
        + Math.sqrt(number));
       /* int Num1 = 0;
        int Doble = 0;
        int Triple = 0;
        int Raiz = 0;
        
        //Con esta funcion declaramos que para introducir una variable, la llamamos como Leer
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        Num1 = Leer.nextInt();
        Doble = Num1 * 2;
        Triple = Num1 * 3;
        Raiz = (int) Math.sqrt(Num1);
        System.out.println("El doble de numero ingresado es: " + Doble);
        System.out.println("El doble de numero ingresado es: " + Num1 * 2);
        System.out.println("El triple de numero ingresado es: " + Triple);
        System.out.println("El triple de numero ingresado es: " + Num1 * 3);
        System.out.println("La raiz del numero ingresado es: " + Raiz);
        System.out.println("La Raiz del numero ingresado es: " + Math.sqrt(Num1));*/

        
    }
    
}
