import java.util.Scanner;

public class TiempoDeViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMinutos = 0;

        System.out.println("Ingrese los tiempos de viaje en minutos (0 para finalizar):");

        while (true) {
            System.out.print("Tiempo del tramo (minutos): ");
            int tiempoTramo = sc.nextInt();

            if (tiempoTramo == 0) {
                break;
            }

            totalMinutos += tiempoTramo;
        }

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("El tiempo total de viaje es: " + horas + " horas " + minutos + " minutos");
    }
}






