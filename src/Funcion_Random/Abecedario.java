package Funcion_Random;

/**
 *
 * @author mi
 */
public class Abecedario {

    public static void main(String args[]) {

        char[] alfabeto = new char[26];
        
        alfabeto[0] = 'A';
        
        System.out.println("El alfabeto en mayusculas es:");
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('A' + i);
            System.out.print(alfabeto[i] + ", ");
        }
        
        System.out.println("El alfabeto en minusculas es:");
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('a' + i);
            System.out.print(alfabeto[i] + ", ");
        }
        
        
    }
}


