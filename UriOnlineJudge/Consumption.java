import java.util.Scanner;

public class Consumption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long distance = sc.nextLong();
        float fuelSpent = sc.nextFloat();
        System.out.printf("%.3f km/l\n", consumption(distance, fuelSpent));
    }

    private static float consumption(long distance, float fuelSpent){
        return distance/fuelSpent;
    }
}
