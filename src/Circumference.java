/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamed samir
 */
public class Circumference implements ISubscriber{

    
    public void Circumferencefun(double radius )
    {
      double circumference= Math.PI * 2*radius;
      System.out.println( "The circumference of the circle is:"+circumference) ;
    }
 @Override
    public void notifySubscriber(String input) {
        double r = Double.parseDouble(input);
       Circumferencefun(r);
        //System.out.println("volume of the circle "+volume);
    }
    
}
