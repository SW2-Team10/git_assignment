public class Fibonacci implements ISubscriber {

    @Override
    public void notifySubscriber(String input) {
        int number;
        try {
            number = Integer.parseInt(input);
        }catch (Exception e){
            System.out.println("not a valid number for Fibonacci");
            return;
        }
        System.out.println("Fibonacci of "+number+" is "+fib(number));
    }
    long fib(int x){
        if(x<1)return 0;
        if(x==1)return 0;
        if(x==2)return 1;
        return fib(x-1)+fib(x-2);
    }
}
