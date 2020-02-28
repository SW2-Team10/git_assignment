public class CircleVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double r = Double.parseDouble(input);
        double volume =  Math.PI * r * r;
        System.out.println("volume of the circle "+volume);
    }
}
