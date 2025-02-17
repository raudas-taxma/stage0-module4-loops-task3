package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = t < 0 ? -t : t;
        int amount = 0;
        int reminder;
        while (t > 0) {
            reminder = t % 10;
            amount += reminder;
            t = (t - reminder) / 10;
        }
        System.out.println(amount);
    }
}
