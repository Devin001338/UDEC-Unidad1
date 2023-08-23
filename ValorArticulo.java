import java.util.Scanner;

public class ValorArticulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la unidad del artículo: ");
        double valorPorUnidad = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de artículos: ");
        int cantidadArticulos = scanner.nextInt();

        double valorTotal = valorPorUnidad * cantidadArticulos;

        System.out.println("El valor total a pagar es por los articulos es: " + valorTotal);

        scanner.close();
    }
}
