import java.util.Scanner;

public class FuelSpent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float timeSpent = sc.nextFloat();
        float  averageSpeed = sc.nextFloat();
        System.out.printf("%.3f\n",fuelSpent(timeSpent, averageSpeed));
    }

    private static float fuelSpent(float timeSpeng, float averageSpeed){
        return (averageSpeed/12)*timeSpeng;
    }
}