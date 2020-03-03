public class CircleVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double r = Double.parseDouble(input);
        double volume = (4.0/3) * Math.PI * r * r * r;
        System.out.println("volume of the circle "+volume);
    }
}
