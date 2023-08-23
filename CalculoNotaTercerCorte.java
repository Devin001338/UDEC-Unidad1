public class CalculoNotaTercerCorte{ 
    public static void main(String[] args) {
        double notaPrimerCorte = 4.5;
        double notaSegundoCorte = 5.0;
        double notaMinima = 3.0; 
        double  porcentajeNotaTC = 0.60;

        double notaTercerCorte = (notaMinima - (notaPrimerCorte * 0.20) - (notaSegundoCorte * 0.20)) / porcentajeNotaTC; 

        System.out.println("La nota minima que debe aspirar es: " + notaTercerCorte);
 
    }
}