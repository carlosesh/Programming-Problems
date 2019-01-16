import java.util.Scanner;

public class SelectionTest1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        System.out.println( selectionTest1(a,b,c,d) == 1 ? "Valores aceitos" : "Valores nao aceitos");
    }

    private static long selectionTest1(long a, long b, long c, long d){
        if (b>c && d>a && c+d>a+b && c>0 && d>0 && a%2==0)
            return 1;
        return 0;
    }
}
