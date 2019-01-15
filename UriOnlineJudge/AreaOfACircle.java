import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.printf("A=%.4f\n", areaOfACircle(r));
    }

    private static double areaOfACircle(double r){
        return 3.14159*(r*r);
    }
}