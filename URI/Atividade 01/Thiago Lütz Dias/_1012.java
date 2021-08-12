import java.io.IOException;
import java.util.Scanner;

public class _1012 {
    public static void main(String[] args) throws IOException {
        double a, b, c, aT, aC, aTra, aQ, aR;
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        aT = a * c / 2;
        aC = 3.14159 * c * c;
        aTra = (a + b) * c / 2;
        aQ = b * b;
        aR = a * b;

        System.out.printf("TRIANGULO: %.3f\n", aT);
        System.out.printf("CIRCULO: %.3f\n", aC);
        System.out.printf("TRAPEZIO: %.3f\n", aTra);
        System.out.printf("QUADRADO: %.3f\n", aQ);
        System.out.printf("RETANGULO: %.3f\n", aR);
    }
}
