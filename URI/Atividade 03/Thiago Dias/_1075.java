import java.io.IOException;
import java.util.Scanner;

public class _1075 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 10000; i++){
            if (i % n == 2)
                System.out.printf("%d\n", i);
        }
    }
}
