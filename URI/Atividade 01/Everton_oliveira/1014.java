import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int distanciaPercorrida;
        float combustivelGasto, calculo;
        
        distanciaPercorrida = sc.nextInt();
        combustivelGasto = sc.nextFloat();
        calculo = distanciaPercorrida/combustivelGasto;
        System.out.printf("%.3f km/l\n", calculo);
 
    }
 
}
