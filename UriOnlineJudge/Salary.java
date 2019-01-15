import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        long workedHours = sc.nextLong();
        float ratePerHour = sc.nextFloat();
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n" , workedHours*ratePerHour);
    }
}
