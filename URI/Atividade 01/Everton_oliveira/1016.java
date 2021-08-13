import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        int km;
        float calculo;
        Scanner sc = new Scanner(System.in);
        
        km = sc.nextInt();
        System.out.printf("%d minutos\n", km*2);
    }
 
}
