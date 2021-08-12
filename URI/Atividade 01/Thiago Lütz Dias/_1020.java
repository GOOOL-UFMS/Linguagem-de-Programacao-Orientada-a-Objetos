import java.io.IOException;
import java.util.Scanner;

public class _1020 {
    public static void main(String[] args) throws IOException {
        int ageDays, daysLeft, ageY, ageM, ageD;
        Scanner sc = new Scanner(System.in);

        ageDays = sc.nextInt();

        ageY = ageDays / 365;
        daysLeft = ageDays % 365;
        ageM = daysLeft / 30;
        daysLeft %= 30;
        ageD = daysLeft;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ageY, ageM, ageD);
    }
}
