import java.io.IOException;
import java.util.Scanner;

public class _1074 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, x;
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            x = sc.nextInt();

            if (x == 0){
                System.out.println("NULL");
                continue;
            }

            if (x % 2 == 0){
                if (x > 0)
                    System.out.println("EVEN POSITIVE");
                else
                    System.out.println("EVEN NEGATIVE");
            } else{
                if (x > 0)
                    System.out.println("ODD POSITIVE");
                else
                    System.out.println("ODD NEGATIVE");
            }
        }
    }
}
