import java.util.Scanner;

public class SimpleSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println("SOMA = "+extremelyBasic(x,y));
    }

    private static long extremelyBasic(long x, long y){
        return x+y;
    }
}