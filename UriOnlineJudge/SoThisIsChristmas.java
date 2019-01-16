import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoThisIsChristmas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String expectedOutput = soThisIsChristmas(input).toString().replaceAll("\\W", "");
        System.out.printf("Ent%so eh N%st%sl!\n", expectedOutput, expectedOutput, expectedOutput);
    }

    private static List<String> soThisIsChristmas(int input){
        List<String> output = new ArrayList<>();
        for (int i = 0; i <input ; i++) {
            output.add("a");
        }
        return output;
    }
}
