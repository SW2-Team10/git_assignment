public class CircleArea implements ISubscriber {
    public void notifySubscriber(String input)
    {
        double radius = Double.parseDouble(input);
        double area = Math.PI*radius*radius;
        System.out.println("Area of Circle is "+ area);
    }
}
