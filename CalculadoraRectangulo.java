import java.util.Scanner;

public class CalculadoraRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del primer lado: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Ingrese la longitud del segundo lado: ");
        double ladoB = scanner.nextDouble();

        double perimetro = 2 * ladoA + 2 * ladoB;
        double area = ladoA * ladoB;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
}
