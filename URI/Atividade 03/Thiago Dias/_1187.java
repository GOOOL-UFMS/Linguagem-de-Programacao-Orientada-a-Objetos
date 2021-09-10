import java.io.IOException;
import java.util.Scanner;

public class _1187 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int tam = 12, k = 0, count = 0;
        char op;
        double mat[][] = new double[12][12];
        double result = 0;

        op = sc.next().charAt(0);
        for (int i = 0; i < tam; i++){
            for (int j = 0; j < tam; j++){
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < tam; i++){
            k++;
            for (int j = 0; j < tam - k; j++){
                if (j > i){
                    result += mat[i][j];
                    count++;
                }
            }
        }

        if (op == 'M'){
            result /= count;
        }

        System.out.printf("%.1f\n", result);
    }
}
