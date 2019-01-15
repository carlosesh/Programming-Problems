import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banknotes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] banknotes= {100, 50, 20 ,10 ,5, 2, 1};
        long amount  = sc.nextLong();
        List<Long> bills = billsYouWillReceive(amount, banknotes);
        System.out.println(amount);
        for (int i = 0; i <banknotes.length ; i++) {
            System.out.println(bills.get(i) + " nota(s) de R$ " + banknotes[i]+",00");
        }
    }

    private static List<Long> billsYouWillReceive(long amount, long[] bankNotes){
        long difference =amount;
        long currentValue =0;
        List<Long> values = new ArrayList<>();
        for (long note : bankNotes) {
            currentValue = difference/note;
            difference=difference%note;
            values.add(currentValue);
        }
        return values;
    }
}
