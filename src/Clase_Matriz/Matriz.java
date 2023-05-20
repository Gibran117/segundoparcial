package Clase_Matriz;
import java.util.Random;

/**
 *
 * @author mi
 */

public class Matriz {

    public static void main(String[] args) {

        String[] nombres = new String[15];
        Random dado = new Random();

        nombres[0] = ("John");
        nombres[1] = ("Ramos");
        nombres[2] = ("Hudson");
        nombres[3] = ("Kelly");
        nombres[4] = ("Keyes");
        nombres[5] = ("Jorge");
        nombres[6] = ("Emile");
        nombres[7] = ("Jun");
        nombres[8] = ("Johnson");
        nombres[9] = ("Ronaln");
        nombres[10] = ("Carter");
        nombres[11] = ("Kat");
        nombres[12] = ("Grant");
        nombres[13] = ("Lock");
        nombres[14] = ("Noble 6");

        /*for (int i = 0; i <15; i++) {
            for (int j = 0; j < 1; j++) {
                if (i == j);
                i--;
            }

        }*/
        for (int k = 0; k < 15; k++) {
            System.out.println(nombres[dado.nextInt(nombres.length)]);
        }

    }

}


