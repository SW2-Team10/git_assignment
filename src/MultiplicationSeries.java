public class MultiplicationSeries implements ISubscriber {

    private int multiplicationSeries(int n) {

        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;

    }

    @Override
    public void notifySubscriber(String input) {
        int num = 5;
        System.out.println(
                "multiplicationSeries of " + num
                        + " is " + multiplicationSeries(5));

    }
}