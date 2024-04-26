import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String palabraSecreto = "inteligencia";

        int intentosMaximos = 10;

        int intentos = 0;

        boolean palabraAdivinada = false;

        // Arreglo

        char[] letrasAdivinadas = new char[palabraSecreto.length()];

        // Estructura de controlo de iterativa
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out
                    .println("Palabra adivinada: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreto.length()
                            + " letras");

            System.out.println("Introduzca una letra, por favor");

            char letra = Character.toLowerCase(sc.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreto.length(); i++) {
                if (palabraSecreto.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("ntentos te queda " + (intentosMaximos - intentos) + " intentos");

            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreto)) {
                palabraAdivinada = true;
                System.out.println("Has adivina la palabra " + palabraSecreto);
            }

        }
        if (!palabraAdivinada) {
            System.out.println("Que te has queda sin intentos");
        }

        sc.close();
    }
}
