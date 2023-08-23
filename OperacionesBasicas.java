import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int segundoNumero = scanner.nextInt();

        int suma = primerNumero + segundoNumero;
        int resta = primerNumero - segundoNumero;
        int multiplicacion = primerNumero * segundoNumero;
        double division = primerNumero / segundoNumero;
        int resto = primerNumero % segundoNumero;
 
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto: " + resto);

        scanner.close();

    }
}
