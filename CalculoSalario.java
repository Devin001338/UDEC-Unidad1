import java.util.Scanner;

public class CalculoSalario{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Por favor ingrese el valor de la hora laboral: ");
	double valorHora = scanner.nextDouble();
	
	System.out.println("Por favor ingrese el numero de horas laboradas por el trabajador: ");
	double horasLaboradas = scanner.nextDouble();
	
	double salarioTotal = horasLaboradas * valorHora;
	
	double porcentajeRetencion = 0.05; 
	
	double retencionFuente =  salarioTotal * porcentajeRetencion;
	
	double salarioNeto = salarioTotal - retencionFuente;
	
	System.out.println("El salario total del empleado es: $" + salarioTotal); 
	System.out.println("El valor de la retencion en la fuente (5%) del empleado es: $" + retencionFuente);
	System.out.println("El salario neto del empleado es: $" + salarioNeto);

    scanner.close();
	
	}
}
