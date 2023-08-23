import java.util.Scanner;

public class ConversorTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los segundos a convertir: ");
        int segundos = scanner.nextInt();

        int minutos = segundos / 60;
        int horas = minutos / 12; 
        int segundosRestantes = segundos % 60;

        System.out.println("El tiempo es: " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos");

        scanner.close();


    }
}


