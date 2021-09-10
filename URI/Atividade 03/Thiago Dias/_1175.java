import java.io.IOException;
import java.util.Scanner;

public class _1175 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int aux, n[] = new int[20];

        for (int i = 0; i < 20; i++){
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++){
            aux = n[i];
            n[i] = n[n.length - (i+1)];
            n[n.length - (i+1)] = aux;
        }

        for (int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
