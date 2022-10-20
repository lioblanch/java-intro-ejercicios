package exercise1;

import java.util.*;

public class example {

    public static void main(String[] args) {
        
       Scanner leer =  new Scanner(System.in); 
       
        System.out.println("Ingrese la cantidad de jugadores ");
        
               // Asigno valores //

        int jugadores = leer.nextInt();
        String k = leer.nextLine();
        
        List Equipo = new ArrayList();
        
              // Asigno valores mediante For  //
        int i;
              
            
        for (i = 0; i < jugadores; i++) {
            
            System.out.println("Ingrese nombre de jugador " + (i+1) );
            k = leer.nextLine();
            Equipo.add(k);
            
            
        }
              // Muestro el vector //

        System.out.println("Su equipo esta formado por: ");
       
       for (i = 0; i < jugadores; i++) {
            
            System.out.println("Jugador " + (i+1) + " : " + Equipo.get(i)); 
          
     
        }
    }
    
}
