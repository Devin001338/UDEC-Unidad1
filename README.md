# UDEC - INGENIERIA DE SOFTWARE

## FUNDAMENTOS DE LA PROGRAMACIÓN - UNIDAD #1

### Devin Polanco Romero

# <p align="center"><strong> EJERCIOS DE LA ACTIVIDAD DE APRENDIZAJE </strong></p>

1. La empresa Prosegur tiene problema para calcular el salario neto a pagar a
un empleado, desarrollar una solución algoritmo que permita calcular e
imprimir el salario total, salario neto y el 5% del salario total como retención
en la fuente, ingresando por teclado el valor de la hora y el número de horas
trabajadas.

```java
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el valor de la hora laboral: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Por favor ingrese el numero de horas laboradas por el trabajador: ");
        double horasLaboradas = scanner.nextDouble();

        double salarioTotal = horasLaboradas * valorHora;

        double porcentajeRetencion = 0.05;

        double retencionFuente = salarioTotal * porcentajeRetencion;

        double salarioNeto = salarioTotal - retencionFuente;

        System.out.println("El salario total del empleado es: $" + salarioTotal);
        System.out.println("El valor de la retencion en la fuente (5%) del empleado es: $" + retencionFuente);
        System.out.println("El salario neto del empleado es: $" + salarioNeto);

        scanner.close();
    }
}
 ```

2. Un empleado gana en su salario total mensual $1.056.028, si trabajo un total de 36 horas, calcular una solución algorítmica que permita imprimir cual es el valor de una hora trabajada.

```java
public class CalculoValorHora {
    public static void main(String[] args) {
        double salarioTotalMensual = 1056028;
        int numeroHoras = 36;

        double valorHora = salarioTotalMensual / numeroHoras;

        System.out.println("El valor de la hora laborada para el empleado es de: " + valorHora);
    }
}
 ```

3. Un estudiante de Ingeniería de Sistemas de la UdeC tiene tres cortes de notas en una asignatura con valor de 0.0 a 5.0, el primer y segundo corte vale un 20% y el tercer corte vale 60%. Desarrollar una solución algorítmica que permita saber que nota se debe sacar como mínimo en el 60% si conozco los primeros 20%. Tener en cuenta que para superar una asignatura debe ser igual o mayor a 3.0.

 ```java
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
   ```

4. Calcular el área de un triángulo, sabiendo la base y la altura.

```java
public class CalculoAreaTriangulo {
    public static void main(String[] args) {
        double base = 4.8;
        double altura = 16.4;
        double areaTriangulo = base * altura;

        System.out.println("El area del triangulo es: " + areaTriangulo);

    }
}

  ```

5. Calcular el perímetro de un triángulo sabiendo los tres lados.

```java
public class CalculoPerimetro {
    public static void main(String[] args) {
        double ladoA = 55.8;
        double ladoB = 50.1;
        double ladoC = 60.4;

        double perimetro = ladoA + ladoB + ladoC;
        System.out.println("El perímetro del triángulo es: " + perimetro);    
    }
}

  ```

6. Convertir en grados Farengie el valor ingresado por teclado en grados Celcio

```java
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

  ```

7. Convertir en grados Celcios el valor ingresado por teclado en grados Farengei

```java
import java.util.Scanner;

public class ConversorFahrenheitCelsius {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura a convertir en grados Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        System.out.println("La temperatura convertida a grados Celsius es: " + temperaturaCelsius);

        scanner.close();
    }
}

  ```

8. Un programa que lea el valor correspondiente a una distancia en millas
marinas y las escribas expresadas en metros. Sabiendo que 1 milla marina
equivale a 1852 metros.

```java
import java.util.Scanner;

public class MillasMarinasAMetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor a convertir: ");
        double millasMarinas = scanner.nextDouble();

        double metros = millasMarinas * 1852;
        System.out.println("El valor convertido de millas marinas a metros es: " + metros);
        scanner.close();
    }
}

  ```

9. Un programa que escribe el porcentaje descontado en una compra,
introduciendo por teclado el precio de la tarifa y el precio pagado

```java
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
        scanner.close();
    }
}

  ```

10. Un programa que reciba por teclado el precio de un artículo y calcule cual es
el valor pagado por el iva de ese artículo.

    [Solucion del ejercicio](IvaArticulo.java)

11. Un programa que pida por teclado dos números enteros y muestre su suma,
resta, multiplicación, división y el resto (módulo) de la división.

    [Solucion del ejercicio](OperacionesBasicas.java)

12. Un programa que obtiene la última cifra de un número introducido.
  
    [Solucion del ejercicio](UltimaCifraNumero.java)

13. Un programa que tras introducir una medida expresada en centímetros la
convierta en pulgadas (1 pulgada = 2,54 centímetros)

    [Solucion del ejercicio](CentimetrosAPulgadas.java)

14. Un programa que exprese en horas, minutos y segundos un tiempo
expresado en segundos.

    [Solucion del ejercicio](ConversorTiempo.java)

15. Se desea saber cuál es el valor total para pagar de un artículo, sabiendo su
valor por unidad y la cantidad de artículos a llevar. Desarrollar un programa
que, dado el valor de unidad de un artículo y la cantidad de artículos, calcule
el valor total y lo imprima.

    [Solucion del ejercicio](ValorArticulo.java)

16. Desarrollar un algoritmo que dado el radio de un círculo calcule e imprima el
área.

    [Solucion del ejercicio](CalculadoraAreaCirculo.java)

17. Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un
rectángulo dada la longitud de dos de sus lados.
P = 2· a + 2· b
A= a · b

    [Solucion del ejercicio](CalculadoraRectangulo.java)

18. Desarrollar un algoritmo que calcule e imprima el perímetro y el área de un
cuadrado dado uno de sus lados
P = 4 · a
A= a2

    [Solucion del ejercicio](PerimetroYAreaCuadrado.java)

19. Desarrollar un algoritmo que, dado el valor de x, y, z calcule e imprima el
valor de A según la siguiente formula
A=2x2 y3 z
