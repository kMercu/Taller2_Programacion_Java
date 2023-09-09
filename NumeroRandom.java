import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);
        int intentos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número entre 0 y 100.");

        while (true) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int intento = sc.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("Es mayor que " + intento);
                System.out.println();
            } else if (intento > numeroSecreto) {
                System.out.println("Es menor que " + intento);
                System.out.println();
            } else {
                System.out.println("Correcto. Adivinaste en " + intentos + " intentos.");
                System.out.println();
                break;
            }
        }

        sc.close();
    }
}