import java.util.Scanner;

public class TheGreatest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        System.out.println(theGreatest(a, b, c) + " eh o maior");
    }

    private static long theGreatest(long a, long b, long c){
        long total1=0;
        long total2=0;

        total1=((a+b+Math.abs(a-b))/2);
        total2=((total1+c+Math.abs(total1-c))/2);

        return total1>total2 ? total1 : total2;
    }
}