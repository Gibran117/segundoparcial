package Funcion_Random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mi
 */
public class Metodo_Burbuja {

    public static void main(String[] args) {

        int repeticiones;

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cual es el tamaño de la matriz?");
        repeticiones = leer.nextInt();

        int[] matriz = new int[repeticiones];
        Random aleatorio = new Random();
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = aleatorio.nextInt(100 + 1);
        }

        Metodo_Burbuja llamar = new Metodo_Burbuja();

        llamar.Imprimir1(matriz);
        llamar.Burbuja(matriz);
        llamar.Imprimir2(matriz);

    }

    public int[] Imprimir1(int[] matriz) {

        System.out.println("Matriz generada");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + ", ");
        }

        return matriz;

    }

    public int[] Burbuja(int[] Matriz) {
        int repeticiones = Matriz.length;
        for (int i = 0; i < (repeticiones - 1); i++) {
            for (int j = 0; j < (repeticiones - 1); j++) {
                if (Matriz[j] > Matriz[j + 1]) {
                    int aux = Matriz[j];
                    Matriz[j] = Matriz[j + 1];
                    Matriz[j + 1] = aux;
                }
            }
        }
        
        return Matriz;
    }
    
    public void Imprimir2(int[] Matriz1) {
        
        System.out.println("");
        System.out.println("Matriz ordenada de menor a mayor");
        for (int i = 0; i < Matriz1.length; i++) {
            System.out.print(Matriz1[i] + ", ");
        }
    }

}
