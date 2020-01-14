package nivel1;
import java.util.Arrays;
/*
Autor: Javi Bermejo
*/
public class Nivel1 {

    int[] listaNumeros = {99, 55, 87, 28, 7, 15};

    public int[] maximos(int[] lista) {
        int[] arrayMaximos = {lista[0], lista[1]};

        for (int i = 1; i < lista.length; i++) {
            if (arrayMaximos[0] < lista[i]) {
                arrayMaximos[1] = arrayMaximos[0];
                arrayMaximos[0] = lista[i];
            } else if (arrayMaximos[1] < lista[i]) {
                arrayMaximos[1] = lista[i];
            }
        }
        return arrayMaximos;
    }

    private boolean palindromo(String palabra) {
        palabra = quitaEspacio(palabra);
        palabra = palabra.toLowerCase();
        String aux = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            aux = aux + palabra.charAt(i);
        }
        if (palabra.equals(aux)) {
            return true;
        } else {
            return false;
        }

    }

    private String quitaEspacio(String frase) {
        String auxiliar = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                auxiliar = auxiliar + frase.charAt(i);
            }
        }
        return auxiliar;
    }

    public static void main(String[] args) {
        Nivel1 ejercicio = new Nivel1();
        System.out.println(Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));
        System.out.println(ejercicio.palindromo("DABALE ARROZ A LA ZORRA EL ABAD"));
    }

}
