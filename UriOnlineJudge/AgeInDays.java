import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ageInDays = sc.nextInt();
        int years, months, days;
        years = ageInDays/365;
        months = (ageInDays%365)/30;
        days = (ageInDays%365)%30;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
