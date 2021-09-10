import java.io.IOException;
import java.util.Scanner;

public class _1183 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        char op;
        double mat[][] = new double[12][12];
        double result = 0;

        op = sc.next().charAt(0);
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
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
