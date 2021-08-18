import java.io.IOException;
import java.util.Scanner;

public class _1048 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double val, total, reaj, prcnt;

        val = sc.nextDouble();

        if (val > 0 && val <= 400){
            prcnt = 15 / 100.0;
        } else if (val > 400 && val <= 800){
            prcnt = 12 / 100.0;
        } else if (val > 800 && val <= 1200){
            prcnt = 10 / 100.0;
        } else if (val > 1200 && val <= 2000){
            prcnt = 7 / 100.0;
        } else{
            prcnt = 4 / 100.0;
        }

        reaj = val * prcnt;
        total = val + reaj;

        System.out.printf("Novo salario: %.2f\n", total);
        System.out.printf("Reajuste ganho: %.2f\n", reaj);
        System.out.printf("Em percentual: %.0f %%\n", prcnt * 100);
    }
}
