import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Double> snacks = productsList();
        int productCode = sc.nextInt();
        int numberOfItems = sc.nextInt();
        final Double price = snacks.get(productCode);
        System.out.printf("Total: R$ %.2f\n", total(price,numberOfItems));
    }

    private static Map<Integer, Double> productsList() {
        Map<Integer, Double> snacks = new HashMap<>();
        snacks.put(1, 4.00);
        snacks.put(2, 4.50);
        snacks.put(3, 5.00);
        snacks.put(4, 2.00);
        snacks.put(5, 1.50);
        return snacks;
    }

    private static double total(Double price, int number){
        return price*number;
    }
}