import java.util.Scanner;

public class PowerN implements ISubscriber{

    double r = 1.0 ;
    public static double PowerNCalc(int p)
    {
        double r = 1.0;


        if ( p == 0) {
            r = 1;
        }
        else if (p < 0)
        {
            for (int i = -1; i >= p; i--)
            {
                r = r * 2;
            }
            return 1/r ;
        }
        else {
            for (int i = 1; i <= p; i++) {
                r = r * 2;
            }
            return r ;
        }
        return 0 ;
    }


    @Override
    public void notifySubscriber(String input) {
        System.out.println("PowerN = "+PowerNCalc(Integer.parseInt(input)));
    }
}


