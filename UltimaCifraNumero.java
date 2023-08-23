import java.util.Scanner;

public class UltimaCifraNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Obtener la última cifra
        int ultimaCifra = numero % 10;

        System.out.println("La última cifra del número es: " + ultimaCifra);

        scanner.close();
    }
}
