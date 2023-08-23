import java.util.Scanner;

public class MillasMarinasAMetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor a convertir: ");
        double millasMarinas = scanner.nextDouble();

        double metros = millasMarinas * 1852;
        System.out.println("El valor convertido de millas marinas a metros es: " + metros);
        scanner.close();
    }
}
