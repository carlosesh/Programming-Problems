import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ddd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ddd = sc.nextInt();
        System.out.println(getCityName(ddd));
    }

    private static Map<Integer, String> destinationList() {
        Map<Integer, String> codesAndDestination = new HashMap<>();
        codesAndDestination.put(61, "Brasilia");
        codesAndDestination.put(71, "Salvador");
        codesAndDestination.put(11, "Sao Paulo");
        codesAndDestination.put(21, "Rio de Janeiro");
        codesAndDestination.put(32, "Juiz de Fora");
        codesAndDestination.put(19, "Campinas");
        codesAndDestination.put(27, "Vitoria");
        codesAndDestination.put(31, "Belo Horizonte");
        return codesAndDestination;
    }

    private static String getCityName(int ddd) {
        return destinationList().getOrDefault(ddd, "DDD nao cadastrado");
    }
}
