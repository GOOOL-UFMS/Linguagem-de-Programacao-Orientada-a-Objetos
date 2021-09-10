import java.io.IOException;
import java.util.Scanner;

public class _1183 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char op;
        double mat[][] = new double[3][3];
        double result = 0;

        op = sc.next().charAt(0);
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                mat[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (j > i){
                    result += mat[i][j];
                }
            }
        }

        if (op == 'M'){
            result /= 12;
        }

        System.out.printf("%.1f\n", result);
    }
}
