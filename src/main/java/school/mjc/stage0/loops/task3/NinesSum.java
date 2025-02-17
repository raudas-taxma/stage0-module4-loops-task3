package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int amount = 0;
        int nine = 9;
        int n = 1;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            amount += n * nine;
            n = n * 10 + 1;
        }
        System.out.println(amount);
    }
}
