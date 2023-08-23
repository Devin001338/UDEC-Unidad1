import java.util.Scanner;

public class ConversorCelsiusFahrenheit  {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura a convertir en grados Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit  =  temperaturaCelsius * 9 / 5 + 32;

        System.out.println("La temperatura convertida a grados Fahrenheit es: " + temperaturaFahrenheit);

        scanner.close();
    }
}
