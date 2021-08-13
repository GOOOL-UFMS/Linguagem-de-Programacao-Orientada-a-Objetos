import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    double a, b, c, calculo, pi=3.14159;
    Scanner sc = new Scanner(System.in);
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    calculo = (a*c)/2; //areadotriangulo
    System.out.printf("TRIANGULO: %.3f\n", calculo);
    calculo = pi * c * c; //areadocirculo
    System.out.printf("CIRCULO: %.3f\n",calculo);
    calculo = ((a+b)*c)/2; //areadotrapezio
    System.out.printf("TRAPEZIO: %.3f\n",calculo);
    calculo = b*b; //areadoquadrado
    System.out.printf("QUADRADO: %.3f\n",calculo);
    calculo = a*b;//areadoretangulo
    System.out.printf("RETANGULO: %.3f\n",calculo);
 
    }
 
}
