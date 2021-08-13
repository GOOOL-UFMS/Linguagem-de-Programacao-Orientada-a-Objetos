import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    
    
    int matricula, horasTrabalhadas;
    double valorHora, calculo;
    Scanner sc = new Scanner(System.in);
    matricula = sc.nextInt();
    horasTrabalhadas = sc.nextInt();
    valorHora = sc.nextDouble();
    
    calculo = valorHora * horasTrabalhadas;
    
    System.out.println("NUMBER = "+ matricula);
    System.out.printf("SALARY = U$ %.2f\n", calculo);
    
    
    }
 
}
