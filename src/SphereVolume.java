
public class SphereVolume implements ISubscriber {
    @Override

public void notifySubscriber(String input){
    double r = Double.parseDouble(input);
    while(r<0){
        System.out.println("error , radius can't be negative");
         r = Double.parseDouble(input); 
    }
    
    double vol = 4/3* Math.PI * Math.pow(r, 3);
    System.out.println("sphere volume = "+vol);
}
