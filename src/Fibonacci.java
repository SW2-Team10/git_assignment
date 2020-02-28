
public class Fibonacci implements ISubscriber {

	private int fibonaccicalc(int n) {
		if(n<=1) {
			return n;
		}
		
		return fibonaccicalc(n-1)+fibonaccicalc(n-2);
	}

	@Override
	public void notifySubscriber(String input) {
		int res = fibonaccicalc(Integer.parseInt(input));
		System.out.println("Hello, I am Fibonacci subscriber and I am notified with " + res);

	}

}
