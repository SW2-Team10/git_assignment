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
			new CircleArea()
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
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		ISubscriber choice;
		switch (ch){
			case 1:choice = new SummationSeries();break;
			case 2:choice = new CircleVolume();break;
			case 3:choice = new SphereArea();break;
			case 4:choice = new Fibonacci();break;
			case 5:choice = new PowerN();break;
			case 6:choice = new MultiplicationSeries();break;
			default:choice = new CircleArea();
		}
		mathTopic.addSubscriber(choice);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
