import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        double a, b, c, areatriangulo, areacirculo, areatrapezio, areaquadrado, arearetangulo;
        double pi = 3.14159;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        areatriangulo = a * c / 2;
        areacirculo = pi * c * c;
        areatrapezio = (a + b) * c / 2;
        areaquadrado = b * b;
        arearetangulo = a * b;
        
        System.out.printf("TRIANGULO: %.3f\n", areatriangulo);
        System.out.printf("CIRCULO: %.3f\n", areacirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areatrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaquadrado);
        System.out.printf("RETANGULO: %.3f\n", arearetangulo);
    }

}
