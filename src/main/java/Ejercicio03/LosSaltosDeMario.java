package Ejercicio03;

public class LosSaltosDeMario {
    public static void main(String[] args) {

        int[] alturas = {1, 4, 2, 2, 3, 5, 3, 4};
        String saltos = saltos(alturas);
    }
    public static String saltos(int[] alturas) {
        String resultado = "";
        int subir = 0;
        int bajar = 0;
        // escribe lo necesario para producir el resultado
        for (int i = 0; i < alturas.length - 1; i++) {
            if (alturas[i] > alturas[i + 1]){
                bajar++;
            } else if (alturas[i] < alturas[i + 1]){
                subir++;
            }
        }
        resultado = Integer.toString(subir) + " " + Integer.toString(bajar);
        System.out.println(resultado);
        return resultado;
 }
}
