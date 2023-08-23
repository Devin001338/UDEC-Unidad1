import java.util.Scanner;

public class CalculadoraFormulaA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de x: ");
        double x = scanner.nextDouble();

        System.out.println("Ingrese el valor de y: ");
        double y = scanner.nextDouble();

        System.out.println("Ingrese el valor de z: ");
        double z = scanner.nextDouble();

        // Cálculo de A
        double a = 2 * Math.pow(x, 2) * Math.pow(y, 3) * z;

        // Impresión del resultado
        System.out.println("El valor de A es: " + a);

        scanner.close();
    }
}