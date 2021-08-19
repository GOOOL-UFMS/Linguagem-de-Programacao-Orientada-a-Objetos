import java.io.IOException;
import java.util.Scanner;

public class _1072 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, x, in = 0, out = 0;

        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            x = sc.nextInt();

            if (x >= 10 && x <= 20)
                in++;
            else
                out++;
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}
