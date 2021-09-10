import java.io.IOException;
import java.util.Scanner;

public class _1435 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            n = sc.nextInt();

            if (n == 0)
                break;

            int init = 0, fim = 0, matr[][] = new int[n][n];

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    matr[i][j] = 0;
                }
            }

            int tam;
            do{
                for (int i = 0 + init; i < n - fim; i++){
                    for (int j = 0 + init; j < n - fim; j++){
                        matr[i][j]++;
                    }
                }
                tam = n-(fim+init);
                init++;
                fim++;
            } while (tam - 2 > 0);

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (j == 0)
                        System.out.printf("%3d", matr[i][j]);
                    else
                        System.out.printf(" %3d", matr[i][j]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");

        } while (n != 0);
    }
}
