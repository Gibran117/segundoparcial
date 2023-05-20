package Busqueda_Secuencial;

import java.util.Scanner;

/**
 *
 * @author mi
 */

public class Busqueda_Secuencial {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] calificaciones = new int[7];
        
        System.out.println("Ingresa tus Calificaciones");
        
        for(int i=0; i<calificaciones.length; i++){
            System.out.print("Calificacion numero " + (i+1) + ": ");
            calificaciones[i] = leer.nextInt();
        }
        
        int buscar;
        System.out.println("¿Que calificación buscas?");
        buscar=leer.nextInt();
        
        Busqueda_Secuencial llamar=new Busqueda_Secuencial();
        llamar.busqueda(calificaciones, buscar);
        
    }
    
    public void busqueda(int[] calificaciones, int buscar){
        for(int i=0; i<calificaciones.length; i++) {
            if (calificaciones[i] == buscar) {
                System.out.println("El elemento esta en la posició: " + i);
                break;
            } else {
                System.out.println("Elemento no encontrado");
                
            }
        }
    }
}
