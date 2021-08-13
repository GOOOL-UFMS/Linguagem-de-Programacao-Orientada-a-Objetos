import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int numero, quantidade;
        float valor1, valor2;
        Scanner sc  = new Scanner(System.in);
        numero      = sc.nextInt();
        quantidade  = sc.nextInt();
        valor1      = sc.nextFloat();
        valor1      = valor1*quantidade;
        numero      = sc.nextInt();
        quantidade  = sc.nextInt();
        valor2      = sc.nextFloat();
        valor2      = valor2*quantidade;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor1+valor2);
    }
 
}
