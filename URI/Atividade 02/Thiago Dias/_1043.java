import java.io.IOException;
import java.util.Scanner;

public class _1043 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a, b, c, perimetro, area;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f", perimetro);
        }
        else{
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f", area);
        }
    }
}
