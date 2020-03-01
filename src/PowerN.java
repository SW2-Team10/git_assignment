import java.util.Scanner;

public class PowerN
{
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

    public static void main (String arg[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter power");

        int p=sc.nextInt();

        double res = PowerNCalc(p);

        System.out.println(res);
    }


}


