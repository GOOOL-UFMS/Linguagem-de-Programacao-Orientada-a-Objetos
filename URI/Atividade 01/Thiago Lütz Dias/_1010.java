import java.io.IOException;
import java.util.Scanner;

public class _1010 {
    public static void main(String[] args) throws IOException {
        int p1, n1, p2, n2;
        double v1, v2, preco;
        Scanner sc = new Scanner(System.in);

        p1 = sc.nextInt();
        n1 = sc.nextInt();
        v1 = sc.nextDouble();

        p2 = sc.nextInt();
        n2 = sc.nextInt();
        v2 = sc.nextDouble();

        preco = n1 * v1 + n2 * v2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", preco);

    }
}
