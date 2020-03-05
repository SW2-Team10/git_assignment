import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			new SimpleSubscriber(),
			new ReallySimpleSubscriber(),
			new SummationSeries(),
			new CircleVolume(),
			new SphereArea(),
			new Fibonacci(),
			new PowerN(),
			new MultiplicationSeries(),
			new CircleArea(),
      		new SphereVolume (),
      		new Circumference()
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		System.out.println("Enter the function you want to apply");
		System.out.println("1- SummationSeries");
		System.out.println("2- CircleVolume");
		System.out.println("3- SphereArea");
		System.out.println("4- Fibonacci");
		System.out.println("5- PowerN");
		System.out.println("6- MultiplicationSeries");
		System.out.println("7- CircleArea");
    	System.out.println("8- SphereVolume") ;
    	System.out.println("9- Circumference");
		System.out.println("10- Apply all");

		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch){
			case 1:mathTopic.addSubscriber(new SummationSeries());break;
			case 2:mathTopic.addSubscriber(new CircleVolume());break;
			case 3:mathTopic.addSubscriber(new SphereArea());break;
			case 4:mathTopic.addSubscriber(new Fibonacci());break;
			case 5:mathTopic.addSubscriber(new PowerN());break;
			case 6:mathTopic.addSubscriber(new MultiplicationSeries());break;
			case 7:mathTopic.addSubscriber(new CircleArea());break;
			case 8:mathTopic.addSubscriber(new SphereVolume());break;
			case 9:mathTopic.addSubscriber(new Circumference());break;
			default:
				for(ISubscriber subscriber:subscribers){
					mathTopic.addSubscriber(subscriber);
				}
		}
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
