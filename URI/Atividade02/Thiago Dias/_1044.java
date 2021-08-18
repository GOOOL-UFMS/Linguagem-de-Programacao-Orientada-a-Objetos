import java.io.IOException;
import java.util.Scanner;

public class _1044 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a, b;

        a = sc.nextDouble();
        b = sc.nextDouble();

        if (b % a == 0 || a % b == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
