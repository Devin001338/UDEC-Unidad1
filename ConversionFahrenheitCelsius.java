import java.util.Scanner;

public class ConversionFahrenheitCelsius  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura a convertir: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.println("La temperatura convertida a grados Celsius es: " + temperaturaCelsius);
        scanner.close();
    }
}
