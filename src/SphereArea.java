public class SphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double r = Double.parseDouble(input);
        double area =  Math.PI * r * r*4;
        System.out.println("area of the circle "+area);
    }
}
