import java.util.Scanner;

public class PorcentajeDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio pagado: ");
        double precioPagado = scanner.nextDouble();

        System.out.println("Ingrese el precio de la tarifa: ");
        double precioTarifa = scanner.nextDouble();

        double descuento = precioPagado - precioTarifa;
        double porcentajeDescuento = descuento / precioTarifa;
        System.out.println("El procentaje de descuento sobre el precio pagado es: " + porcentajeDescuento);
    }
}
