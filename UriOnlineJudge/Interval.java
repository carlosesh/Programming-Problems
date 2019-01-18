import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.println(interval(input));
    }

    private static String interval(double input){
        if(input>=0 && input<=25.00)
            return "Intervalo [0,25]";
        else if(input>25.00 && input<=50.00)
            return "Intervalo (25,50]";
        else if(input>50.00 && input<=75.00)
            return "Intervalo (50,75]";
        else if(input>75.00 && input<=100.00)
            return "Intervalo (75,100]";
        else
            return "Fora de intervalo";
    }
}
