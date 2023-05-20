package Funcion_Random;

import java.util.Scanner;

/**
 *
 * @author mi
 */
public class Suma_de_numeros {

    public static void main(String[] args) {

        int sumaPares = 0;
        int sumaImpares = 0;
        
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingresa un número entero (%d de 10): ", i + 1);
            int numero = leer.nextInt();
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        
        leer.close();
        System.out.printf("Resultado: Total pares: %d; Total impares: %d", sumaPares, sumaImpares);
    }

}
