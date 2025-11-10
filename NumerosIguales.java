import java.util.Scanner;

public class NumerosIguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Son iguales.");
        } else {
            System.out.println("Son diferentes.");
        }
        sc.close();
    }
}