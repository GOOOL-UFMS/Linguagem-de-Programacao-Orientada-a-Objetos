import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class _1042 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int[] valores = {a, b, c};
        int[] valOrdenados = new int[3];
        System.arraycopy(valores, 0, valOrdenados, 0, valOrdenados.length);

        Arrays.sort(valOrdenados);

        for (int j : valOrdenados){
            System.out.println(j);
        }
        System.out.println();
        for (int k : valores){
            System.out.println(k);
        }
    }
}
