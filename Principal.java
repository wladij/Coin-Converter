import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcionBucle;

        do {
            mostrarMenu();
            opcionBucle = obtenerOpcion();
            if (opcionBucle != 7) {
                procesarOpcion(opcionBucle);
            }
        } while (opcionBucle != 7);

        System.out.println("Gracias por usar el conversor de divisas.");
    }

    private static void mostrarMenu() {
        System.out.println("""
                ***************************************************
                Bienvenido al Conversor de Monedas =)
                
                1) Dólar ==> Peso Argentino.
                2) Peso Argentino ==> Dólar.
                3) Dólar ==> Real Brasileño.
                4) Real Brasileño ==> Dólar.
                5) Dólar ==> Peso Colombiano.
                6) Peso Colombiano ==> Dólar.
                7) Salir.
                
                Elige una opción:
                ***************************************************
                """);
    }

    private static int obtenerOpcion() {
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine(); // Limpiar el buffer
            System.out.println("Opción inválida. Intente nuevamente.");
            return 0;
        }
    }

    private static void procesarOpcion(int opcion) {
        try {
            System.out.println("Ingrese el valor que desea convertir:");
            double cantidad = sc.nextDouble();
            ApiRequest consulta = new ApiRequest(opcion, cantidad);
            consulta.llamadaRequest();

            System.out.printf("El valor de %s de %.2f es de %.2f%n", consulta.getValores(), cantidad, consulta.getResultado());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            sc.nextLine(); // Limpiar el buffer
        }
    }
}
