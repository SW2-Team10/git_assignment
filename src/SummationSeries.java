public class SummationSeries implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        int n = Integer.valueOf(input);
        int sum = 0;
        for (int i = n; i > 0; i--) {
            sum += i;
        }
        System.out.println("summation series "+sum);
    }
}
