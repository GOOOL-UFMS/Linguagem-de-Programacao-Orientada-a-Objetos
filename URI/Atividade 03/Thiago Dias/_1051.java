import java.io.IOException;
import java.util.Scanner;

public class _1051 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double renda, impostoAnterior, imposto;
        renda = sc.nextDouble();

        if (renda <= 2000){
            System.out.println("Isento");
        } else if (renda > 2000 && renda <= 3000){
            imposto = (renda - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (renda > 3000 && renda <= 4500){
            impostoAnterior = 1000 * 0.08;
            imposto = ((renda - 3000) * 0.18) + impostoAnterior;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            impostoAnterior = 1000 * 0.08 + 1500 * 0.18;
            imposto = ((renda - 4500) * 0.28) + impostoAnterior;
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
