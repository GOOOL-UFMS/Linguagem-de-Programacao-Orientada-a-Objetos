import java.util.Scanner;
import java.io.IOException;

public class _1005 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        double a, b, media, p1, p2;

        a = sc.nextDouble();
        p1 = 3.5;
        b = sc.nextDouble();
        p2 = 7.5;

        media = (a * p1 + b * p2) / (p1 + p2);

        System.out.printf("MEDIA = %.5f", media);

    }
}
