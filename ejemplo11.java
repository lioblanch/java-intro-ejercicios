/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class ejemplo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = 0;
        int number2 = 0;
        int result = 0;
        String option;
        boolean exit = false;
        
        Scanner reader = new Scanner(System.in);
        
        
        System.out.println("Ingrese el primer valor");
        number1 = reader.nextInt();
        
        System.out.println("Ingrese el segundo valor");
        number2 = reader.nextInt();
        
        while(!exit){  
            System.out.println("Escoja que tipo de operacion quiere realizar");
            System.out.println("MENU");     
            System.out.println("1. Sumar");  
            System.out.println("2. Restar");  
            System.out.println("3. Multiplicar");  
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            try{
                
            
            result = reader.nextInt();
            
            switch(result){
            case 1:
                System.out.println("Su resultado es " + (number1 + number2));
               break;
            case 2:
                System.out.println("Su resultado es " + (number1 - number2));
                break;
            case 3:
                System.out.println("Su resultado es " + (number1 * number2));
                break;
            case 4:
                if(number2 == 0){
                    System.out.println("Indefinido");
                }else{
                System.out.println("Su resultado es " + (number1 / number2));
                }
                break;
               
            case 5:
                while(exit==false){
                System.out.println("Esta seguro que quiere salir S/N");
                option = reader.next();
                
                if ((option.equals("s")) || (option.equals("S"))) {
                exit = true;
                break;
            }else{
                exit=false;
                break;
                    }
                }
                break;
            default:
                System.out.println("Su numero es diferente a las opciones");

    }
            }catch(InputMismatchException e){
                System.out.println("Debes introducir un numero");
                reader.next();
            }
        
    }
    
}
}

