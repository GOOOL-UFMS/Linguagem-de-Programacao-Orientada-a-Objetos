import java.io.IOException;
import java.util.Scanner;

public class _1038 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cod, quant;
        double total, preco;

        cod = sc.nextInt();
        quant = sc.nextInt();

        switch (cod){
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
            default:
                preco = 0;
                break;
        }

        total = quant * preco;
        System.out.printf("Total: R$ %.2f\n", total);

    }
}
