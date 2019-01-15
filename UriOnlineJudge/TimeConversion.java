import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong();
        if (time==1) {
            System.out.println("0:0:1");
        } else {
            List<Long> values = timeConversion(time);
            System.out.println(values.get(0) + ":" + values.get(1) + ":" + values.get(2));
        }
    }

    private static List<Long> timeConversion(long time){
        long hours=0, minutes=0, seconds =0;
        List<Long> timeConverted = new ArrayList<>();
        if(time/3600<1){
            timeConverted.add(hours);
            if(time/60>1) {
                minutes = time/60;
                timeConverted.add(minutes);
                if(time%60>1){
                    seconds=time%60;
                    timeConverted.add(seconds);
                }
            }
        } else {
            hours = time/3600;
            timeConverted.add(hours);
            if(time%3600>1){
                minutes = (time%3600)/60;
                timeConverted.add(minutes);
            } if ((time%3600)%60<=60) {
                seconds = (time%3600)%60;
                timeConverted.add(seconds);
            }
        }

        return timeConverted;
    }
}
