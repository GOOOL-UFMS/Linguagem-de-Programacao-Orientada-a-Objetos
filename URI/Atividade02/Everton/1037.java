import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
        double valor;
        valor = input.nextDouble();

        if (0 > valor || valor > 100){
            System.out.println("Fora de intervalo");
        } else {
            if(valor >= 0 && valor <= 25){
                System.out.println("Intervalo [0,25]");
            }
            else if(valor > 25 && valor <= 50){
                System.out.println("Intervalo (25,50]");
            }
            else if(valor > 50 && valor <= 75){
                System.out.println("Intervalo (50,75]");
            }
            else if(valor > 75 && valor <= 100){
                System.out.println("Intervalo (75,100]");
                }
 
    }
    }
}
