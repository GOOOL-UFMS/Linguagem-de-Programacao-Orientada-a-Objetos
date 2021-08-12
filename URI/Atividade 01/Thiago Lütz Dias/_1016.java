import java.io.IOException;
import java.util.Scanner;

public class _1016 {
    public static void main(String[] args) throws IOException {
        int dist, min;
        Scanner sc = new Scanner(System.in);

        dist = sc.nextInt();
        min = dist * 2;

        System.out.printf("%d minutos\n", min);
    }
}
