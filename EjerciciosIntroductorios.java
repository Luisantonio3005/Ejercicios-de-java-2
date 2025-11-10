import java.util.Scanner;

public class EjerciciosIntroductorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("\nEjercicio 1: Ecuación de segundo grado");
        System.out.print("Introduce el coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Introduce el coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Introduce el coeficiente c: ");
        double c = sc.nextDouble();

        double discriminante = b*b - 4*a*c;
        if (a == 0) {
            System.out.println("No es ecuación de segundo grado (a debe ser distinto de 0).");
        } else if (discriminante < 0) {
            System.out.println("No existen soluciones reales.");
        } else if (discriminante == 0) {
            double x = -b / (2*a);
            System.out.println("Existe una única solución real: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            System.out.println("Las soluciones reales son: x1 = " + x1 + ", x2 = " + x2);
        }

        // Ejercicio 2
        System.out.println("\nEjercicio 2: Área de un círculo");
        System.out.print("Introduce el radio del círculo: ");
        double radioCirculo = sc.nextDouble();
        double area = Math.PI * Math.pow(radioCirculo, 2);
        System.out.println("El área del círculo es: " + area);

        // Ejercicio 3
        System.out.println("\nEjercicio 3: Longitud de una circunferencia");
        System.out.print("Introduce el radio de la circunferencia: ");
        double radioCircunferencia = sc.nextDouble();
        double longitud = 2 * Math.PI * radioCircunferencia;
        System.out.println("La longitud de la circunferencia es: " + longitud);

        // Ejercicio 4
        System.out.println("\nEjercicio 4: Comprobación de igualdad entre dos números");
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }

        // Ejercicio 5
        System.out.println("\nEjercicio 5: Indicar si el número es positivo o negativo");
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("El número es positivo.");
        } else if (num < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        sc.close();
    }
}