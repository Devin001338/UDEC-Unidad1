import java.util.Scanner;

public class CentimetrosAPulgadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida en centimetros a convertir: ");
        double medidaCentimetros = scanner.nextDouble();

        double medidaPulgadas = medidaCentimetros / 2.54;
        System.out.println("La medida convertida a Pulgadas es: " + medidaPulgadas);
        scanner.close();
    }
}
