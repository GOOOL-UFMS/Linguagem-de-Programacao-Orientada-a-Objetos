import java.io.IOException;
import java.util.Scanner;

public class _1007 {
    public static void main(String[] args) throws IOException {
        int a, b, c, d, diff;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diff = a * b - c * d;

        System.out.printf("DIFERENCA = %d\n", diff);

    }
}
