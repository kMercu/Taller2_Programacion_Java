import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        if (esPalindromo(num)) {
            System.out.println(num + " es un palíndromo.");
        } else {
            System.out.println(num + " no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(int num) {
        int numOriginal = num;
        int invertido = 0;

        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return numOriginal == invertido;
    }
}