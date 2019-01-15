import java.util.Scanner;

public class ExtremelyBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println("X = "+extremelyBasic(x,y));
    }

    private static long extremelyBasic(long x, long y){
        return x+y;
    }
}
