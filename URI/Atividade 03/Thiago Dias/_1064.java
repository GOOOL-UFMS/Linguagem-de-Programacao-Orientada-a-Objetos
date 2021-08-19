import java.io.IOException;
import java.util.Scanner;

public class _1064 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int qntPositivos = 0;
        double media = 0, valor;

        for (int i = 0; i < 6; i++){
            valor = sc.nextDouble();
            if (valor > 0){
                qntPositivos++;
                media += valor;
            }
        }

        media /= qntPositivos;

        System.out.printf("%d valores positivos\n", qntPositivos);
        System.out.printf("%.1f\n", media);
    }
}
