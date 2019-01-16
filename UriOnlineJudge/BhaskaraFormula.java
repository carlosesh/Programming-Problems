import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BhaskaraFormula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  a = sc.nextDouble();
        double  b = sc.nextDouble();
        double c = sc.nextDouble();
        if ((a == 0) || (((b*b) -(4*a*c)) < 0)) {
            System.out.print("Impossivel calcular\n");
        }else {
            System.out.printf("R1 = %.5f\n", bhaskaraFormula(a, b, c).get(0));
            System.out.printf("R2 = %.5f\n", bhaskaraFormula(a, b, c).get(1));
        }
    }

    private static List<Double> bhaskaraFormula(double a, double b, double c){
        List<Double> output = new ArrayList<>();
        output.add(((-b + Math.sqrt(((b*b) -(4*a*c)))) / (2*a)));
        output.add(((-b - Math.sqrt(((b*b) -(4*a*c)))) / (2*a)));
        return output;
    }
}