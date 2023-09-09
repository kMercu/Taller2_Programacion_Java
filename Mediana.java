import java.util.ArrayList;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Ingrese números ordenados (ingrese '.' para terminar):");

        while (true) {
            String input = sc.nextLine();
            if (input.equals(".")) {
                break;
            }

            try {
                double numero = Double.parseDouble(input);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingrese un número o '.' para finalizar.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            double mediana = calcularMediana(numeros);
            System.out.println("La mediana es: " + mediana);
        }
    }

    private static double calcularMediana(ArrayList<Double> numeros) {
        int n = numeros.size();
        int medio = n / 2;

        if (n % 2 == 1) {
            return numeros.get(medio);
        } else {
            double medio1 = numeros.get(medio - 1);
            double medio2 = numeros.get(medio);
            return (medio1 + medio2) / 2.0;
        }
    }
}