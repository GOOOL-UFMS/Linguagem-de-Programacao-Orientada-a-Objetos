import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int quantidadeDia;
        quantidadeDia = sc.nextInt();
        System.out.printf("%d ano(s)\n", quantidadeDia/365);
        System.out.printf("%d mes(es)\n", quantidadeDia%365/30);
        System.out.printf("%d dia(s)\n",quantidadeDia%365%30);
    }
 
}
