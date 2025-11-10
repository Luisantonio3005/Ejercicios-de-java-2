import java.util.Scanner;

public class EcuacionSegundoGrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("No es ecuación de segundo grado.");
        } else if (discriminante < 0) {
            System.out.println("No existen soluciones reales.");
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Solución única: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones reales son: x1 = " + x1 + ", x2 = " + x2);
        }
        sc.close();
    }
}