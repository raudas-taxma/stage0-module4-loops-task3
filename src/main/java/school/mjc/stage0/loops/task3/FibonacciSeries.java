package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int curNumber = 0;
        int prevNumber = 1;
        int fib = 0;

        for(int i = 0; i < lastFibonacci; i++) {
            System.out.println(fib);
            fib = prevNumber + curNumber;
            prevNumber = curNumber;
            curNumber = fib;
        }
    }
}
