import java.io.IOException;
import java.util.Scanner;

public class _1037 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n;

        n = sc.nextDouble();

        if (0 <= n && n <= 25)
            System.out.println("Intervalo [0,25]");
        else if (25 < n && n <= 50)
            System.out.println("Intervalo (25,50]");
        else if (50 < n && n <= 75)
            System.out.println("Intervalo (50,75]");
        else if (75 < n && n <= 100)
            System.out.println("Intervalo (75,100]");
        else
            System.out.println("Fora de intervalo");
    }
}
