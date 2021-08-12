import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a, b, mult;
        a = sc.nextInt();
        b = sc.nextInt();
        mult = a * b;
        System.out.printf("PROD = %d\n", mult);
    }
}
