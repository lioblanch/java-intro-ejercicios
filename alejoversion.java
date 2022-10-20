package exercise1;

import java.util.Scanner;

public class alejoversion {

    public static void main(String[] args) {
        
       Scanner leer =  new Scanner(System.in); 
       
        System.out.println("Ingrese la cantidad de jugadores ");
        
               // Asigno valores //

        int jugadores = leer.nextInt();
        String k = leer.nextLine();
        
        String [] Equipo = new String[jugadores];
        
              // Asigno valores mediante For  //
        int i;
              
            
        for (i=0; i < jugadores; i++) {
           
            System.out.println("Ingrese nombre de jugador " + i );
            Equipo[i] = leer.nextLine();
            
        }
              // Muestro el vector //

        System.out.print("Su equipo esta formado por: ");
       
       for (i = 0; i < Equipo.length; i++) {
            
            System.out.println("Jugador " + (i+1) + " : " + Equipo[i]); 
          
     
        }
    }
    
}
