import java.util.Scanner;

public class Average1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.printf("MEDIA = %.5f\n", average(x, y));
    }

    private static double average(double x, double y){
        return ((x*3.5)+(y*7.5))/(3.5+7.5);
    }
}