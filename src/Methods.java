/**
 * Created by alexandraqin on 4/14/15.
 */

import java.util.Random;

public class Methods
{

    public static void main(String args[])
    {
        System.out.println(calculateSquare(6));
        System.out.println(calculateSquareRoot(36));
        System.out.println(toLowerCase("HELLO WORLD"));
        System.out.println(isMultiple(4, 2));
        prettyInteger(12);
        System.out.println(random(2, 10));

    }

    public static int calculateSquare(int number)
    {
        return (number * number);
    }

    public static double calculateSquareRoot(int number)
    {
        return Math.sqrt(number);
    }

    public static String toLowerCase(String myStr)
    {
        return myStr.toLowerCase();
    }

    public static boolean isMultiple(int num1, int num2)
    {
        return (num2 % num1 == 0);

    }

    public static void prettyInteger(int num)
    {

        String stars = "";

        for(int i = 0; i < num; i++)
        {
            stars += "*";
        }

        System.out.println(stars + " " + num + " " + stars);

    }

    public static int random(int num1, int num2)
    {

        int num;
        while(true)
        {
             num = new Random().nextInt(num2);

            if(num >= num1)
            {
                break;
            }
        }
        return num;

    }
}
