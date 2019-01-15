import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        System.out.printf("MEDIA = %.1f\n", average(x, y, z));
    }

    private static double average(double x, double y,double z){
        return ((x*2)+(y*3)+(z*5))/(2+3+5);
    }
}