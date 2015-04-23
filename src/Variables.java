import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by alexandraqin on 4/14/15.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Variables
{

    public static void main(String args[])
    {

        returnVariable();

        int num = 73;
        System.out.println(isOdd(num));
        System.out.println(printHelloWorld(5));
        System.out.println("Greatest common factor of your numbers is: " + greatestCommonFactor(12,9));


    }

    public static void returnVariable()
    {

        int num = 113;
        double decimalNum = 2.71828;
        String myStr = "Computer Science";

        System.out.println("This is room #: " + num);
        System.out.println("e is close to: " + decimalNum);
        System.out.println("I am learning a bit about: " + myStr);
    }

    public static boolean isOdd(int num)
    {
        return (num % 2 == 1);
    }

    public static String printHelloWorld(int num)
    {

        String printHello = "";

        for(int i = 0; i < num; i++)
        {
            printHello += "HelloWorld";
        }

        return printHello;
    }

    public static int greatestCommonFactor(int num1, int num2)
    {

        int divisor = 1;
        ArrayList<Integer> num1Array = new ArrayList<Integer>();
        ArrayList<Integer> num2Array = new ArrayList<Integer>();
        ArrayList<Integer> commonFactors = new ArrayList<Integer>();

        //populate num1Array with all num1 divisors
        while(true)
        {
            if(divisor >  num1)
            {
                break;
            }
            if(num1 % divisor == 0)
            {
                num1Array.add(divisor);
            }
            divisor++;
        }

        divisor = 1;
        //populate num2Array with all num2 divisors
        while(true)
        {
            if(divisor > num2)
            {
                break;
            }
            if(num2 % divisor == 0)
            {
                num2Array.add(divisor);
            }
            divisor++;
        }
        //populate commonFactors  with all common factors
        for(Integer num1Divisors : num1Array)
        {
            for(Integer num2Divisors : num2Array)
            {
                if(num1Divisors == num2Divisors)
                {
                    commonFactors.add(num2Divisors);
                }
            }
        }

        //look for the greatest common factor in array list (got this code from a website:
        // http://www.java-examples.com/find-largest-and-smallest-number-array-example
        int smallest = commonFactors.get(0);
        int largest = commonFactors.get(0);
        for(int i = 1; i < commonFactors.size(); i++)
        {
            if(commonFactors.get(i) > largest) largest = commonFactors.get(i);
            else if(commonFactors.get(i) < smallest) smallest = commonFactors.get(i);
        }

        return largest;
        //return 4;

    }
}
