import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long speed = sc.nextLong();
        System.out.println(distance(speed) + " minutos");
    }

    private static long distance(long speed){
        return speed*2;
    }
}