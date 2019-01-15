import java.util.Scanner;

public class SalaryWithBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double totalSold = sc.nextDouble();
        System.out.printf("TOTAL = R$ %.2f\n" , salary+(totalSold*0.15));
    }
}
