package Ejercicio01;

import java.util.ArrayList;

public class FizzBuzz {
    public static String fizzBuzz() {
        // resuelve aqui el ejercicio y devuelve el String resultante
        String cadena = "";
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
               cadena = cadena + "\nfizzbuzz";
            } else if (i % 5 == 0) {
                cadena = cadena + "\nbuzz";
            } else if (i % 3 == 0) {
                cadena = cadena + "\nfizz";
            } else {
                 cadena = cadena + "\n" + String.valueOf(i);
            }
        }
        return cadena;
    }
}
