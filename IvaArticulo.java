import java.util.Scanner;

public class IvaArticulo {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese el valor del articulo: ");
        double precioArticulo = scanner.nextDouble();

        double iva = precioArticulo * 0.19;
        double precioArticuloIVA = iva + precioArticulo;

        System.out.println("El valor del IVA es: " + iva);
        System.out.println("El valor pagado con el IVA es: " + precioArticuloIVA);

        scanner.close();
    }
}
