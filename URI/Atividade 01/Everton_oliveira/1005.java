import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double valor1, valor2, media;
        Scanner input = new Scanner(System.in);
        double peso1 = 3.50;
        double peso2;
        peso2 = 7.50;
        valor1 = input.nextDouble();
        valor2 = input.nextDouble();
        media = (valor1*peso1 + valor2*peso2)/11;

        System.out.printf("MEDIA = %.5f\n", media);
 
    }
 
}
