import java.io.IOException;
import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) throws IOException {
        int func, h;
        double vHour, wage;
        Scanner sc = new Scanner(System.in);

        func = sc.nextInt();
        h = sc.nextInt();
        vHour = sc.nextDouble();

        wage = h * vHour;

        System.out.printf("NUMBER = %d\n", func);
        System.out.printf("SALARY = U$ %.2f\n", wage);


    }
}
