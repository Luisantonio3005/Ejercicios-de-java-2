import java.util.Scanner;

public class LongitudCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radio de la circunferencia: ");
        double radio = sc.nextDouble();
        double longitud = 2 * Math.PI * radio;
        System.out.println("La longitud de la circunferencia es: " + longitud);

        sc.close();
    }
}