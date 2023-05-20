package Funcion_Random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mi
 */
public class Practica {

    public static void main(String[] args) {

        int repeticiones;

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cual es el tamaño de la matriz?");
        repeticiones = leer.nextInt();

        int[] matriz = new int[repeticiones];
        Random aleatorio = new Random();
        for (int i = 0; i < repeticiones; i++) {
            matriz[i] = aleatorio.nextInt(100 + 1);
        }

        Practica llamar = new Practica();
        llamar.Imprimir1(matriz);
        llamar.Burbuja(matriz);
        llamar.Imprimir2(matriz);
        
    }

    public void Imprimir1(int[] Matriz0) {
        
        System.out.println("Matriz generada");
        for (int i = 0; i < Matriz0.length; i++) {
            System.out.print(Matriz0[i] + ", ");
        } 
        
    }
    
    public void Burbuja(int[] Matriz1) {

        int vector = Matriz1.length;

        for (int i = 0; i < (vector - 1); i++) {
            for (int j = 0; j < (vector - 1); j++) {
                if (Matriz1[j] > Matriz1[j + 1]) {
                    int aux = Matriz1[j];
                    Matriz1[j] = Matriz1[j + 1];
                    Matriz1[j + 1] = aux;
                }
            }
        }

    }

    public void Imprimir2(int[] Matriz1) {
       
        System.out.println(" ");
        System.out.println("Matriz ordenada de menor a mayor");
        for (int i=0; i<Matriz1.length; i++) {
            System.out.print(Matriz1[i] + ", ");
        }
        
    }
    
}