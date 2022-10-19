/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.util.Scanner;

/**
 *
 * @author alida
 */
public class funcionee11 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cambioValor(frase);
        cambioValor(leer.nextLine());

    }

    public static void cambioValor(String frase){
       
       String nuevafrase=frase.replace("a", "@").replace("e","#").replace("i","$").replace("o","%").replace("u","*");
        System.out.println(nuevafrase);

    }
}
