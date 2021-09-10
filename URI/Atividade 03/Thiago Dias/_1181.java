import java.io.IOException;
import java.util.Scanner;

public class _1181 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int linha;
        char op;
        double mat[][] = new double[12][12];
        double result = 0;

        linha = sc.nextInt();
        op = sc.next().charAt(0);
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                mat[i][j] = sc.nextDouble();
            }
        }

        if (op == 'S'){
            for (int i = 0; i < 12; i++){
                result += mat[linha][i];
            }
        } else if (op == 'M'){
            for (int i = 0; i < 12; i++){
                result += mat[linha][i];
            }
            result /= 12;
        }

        System.out.printf("%.1f\n", result);
    }
}
