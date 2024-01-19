package Ejercicio02;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        // solución
        camelCase("el-guerrero-sigiloso");
    }

    public static String camelCase(String texto) {
        // escribe en este método la solución
        String mayusculas = "";
        String texto2 = texto;
        for (int i = 0; i < texto.length() - 1; i++) {
            if (texto.substring(i, i + 1).equals("-") || texto.substring(i, i + 1).equals("_")) {
                mayusculas = texto.substring(i + 1, i + 2).toUpperCase();
                 texto2 = texto2.substring(0, i) + mayusculas + texto.substring(i + 2);
            }
        }
        texto2 = texto2.replace("-", "");
        texto2 = texto2.replace("_", "");
        return texto2;
    }


}
