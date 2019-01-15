import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        System.out.println("DIFERENCA = " + difference(a, b, c, d));
    }

    private static long difference(long a, long b, long c, long d){
        return ((a*b)-(c*d));
    }
}
