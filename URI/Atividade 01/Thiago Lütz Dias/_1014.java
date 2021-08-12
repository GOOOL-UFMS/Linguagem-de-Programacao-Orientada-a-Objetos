import java.io.IOException;
import java.util.Scanner;

public class _1014 {
    public static void main(String[] args) throws IOException {
        double km, l, consumo;
        Scanner sc = new Scanner(System.in);

        km = sc.nextDouble();
        l = sc.nextDouble();

        consumo = km / l;

        System.out.printf("%.3f km/l\n", consumo);
    }
}
