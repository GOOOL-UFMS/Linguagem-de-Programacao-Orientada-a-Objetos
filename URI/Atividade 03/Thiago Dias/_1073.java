import java.io.IOException;
import java.util.Scanner;

public class _1073 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, quadrado;
        n = sc.nextInt();

        for (int i = 2; i <= n; i += 2){
            quadrado = i * i;
            System.out.printf("%d^2 = %d\n", i, quadrado);
        }
    }
}
