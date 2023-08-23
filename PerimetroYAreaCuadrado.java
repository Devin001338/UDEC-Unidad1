import java.util.Scanner;

public class PerimetroYAreaCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de un lado del cuadrado: ");
        double lado = scanner.nextDouble();

         
        double perimetro = 4 * lado;
        double area = Math.pow(lado, 2);

         
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        System.out.println("El área del cuadrado es: " + area);

        scanner.close();
    }
}
