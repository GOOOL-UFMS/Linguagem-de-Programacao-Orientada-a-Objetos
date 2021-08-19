import java.io.IOException;
import java.util.Scanner;

public class _1066 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0, positivos = 0, negativos = 0, valor;

        for (int i = 0; i < 5; i++){
            valor = sc.nextInt();
            if (valor % 2 == 0)
                pares++;
            else
                impares++;

            if (valor > 0)
                positivos++;
            else if (valor < 0)
                negativos++;
        }

        System.out.printf("%d valor(es) par(es)\n", pares);
        System.out.printf("%d valor(es) impar(es)\n", impares);
        System.out.printf("%d valor(es) positivo(s)\n", positivos);
        System.out.printf("%d valor(es) negativo(s)\n", negativos);
    }
}
