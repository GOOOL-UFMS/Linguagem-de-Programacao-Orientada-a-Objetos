import java.io.IOException;
import java.util.Scanner;

public class _1174 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float a[] = new float[100];

        for (int i = 0; i < 100; i++){
            a[i] = sc.nextFloat();
            if (a[i] <= 10){
                System.out.printf("A[%d] = %.1f\n", i, a[i]);
            }
        }
    }
}
