import java.io.IOException;
import java.util.Scanner;

public class _1180 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, x[];
        n = sc.nextInt();
        x = new int[n];
        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
        }

        int min = x[0], ind = 0;
        for (int i = 0; i < n; i++){
            if (x[i] < min){
                min = x[i];
                ind = i;
            }
        }
        System.out.printf("Menor valor: %d\nPosicao: %d\n", min, ind);
    }
}
