import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int positivos = 0;
        int negativos = 0;
        
        System.out.println("Ingrese varios valores (enteros), termine con cero:");
        
        do {
            numero = sc.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        } while (numero != 0);
        
        
        System.out.print("\nGráfico de números positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        System.out.print("Gráfico de números negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
        
        sc.close();
    }
}