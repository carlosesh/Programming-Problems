import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] points = new double[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = sc.nextDouble();
        }
        System.out.printf("%.4f\n", distanceBetweenTwoPoints(points));
    }

    private static double distanceBetweenTwoPoints(double[] values){
        return Math.sqrt(((values[2]-values[0]))*((values[2]-values[0]))+((values[3]-values[1])*(values[3]-values[1])));
    }
}
