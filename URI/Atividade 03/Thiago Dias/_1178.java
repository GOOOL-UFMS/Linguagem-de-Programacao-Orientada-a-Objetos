import java.io.IOException;
import java.util.Scanner;

public class _1178 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double x, n[] = new double[100];
        x = sc.nextDouble();
        n[0] = x;

        for (int i = 1; i < 100; i++){
            n[i] = 0;
            n[i] = n[i-1] / 2;
        }

        for (int i = 0; i < 100; i++){
            System.out.printf("N[%d] = %.4f\n", i, n[i]);
        }
    }
}
