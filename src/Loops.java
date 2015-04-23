import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops
{

    public static void main(String args[])
    {
        //printnumbers1to10();
        //printnumbers1to20();
        //printNumber1toN(6);
        //printEvenNumbers1toN(91);
        //printSumOf1Upto10UsingForLoop();
        //printSumOf1UptoNUsingForLoop(3);
        //sumNumbers("7 9o");
        //System.out.println(notReplace("-is great"));
        //System.out.println(betweenWords("rrHE", "HE"));
    }

    public static void printNumbers1to10()
    {

        for(int i = 1; i < 11; i++)
        {
            System.out.println(i);
        }

    }

    public static void printNumbers1to20()
    {

        int i = 1;

        while(true)
        {
            if(i > 20)
            {
                break;
            }
            System.out.println(i);
            i++;
        }

    }

    public static void printNumber1toN(int num)
    {

        for(int i = 1; i <= num; i++)
        {
            System.out.println(i);
        }

    }

    public static void printEvenNumbers1toN(int num)
    {

        for(int i = 2; i <= num; i += 2)
        {
            System.out.println(i);
        }

    }

    public static void printSumOf1Upto10UsingForLoop()
    {
        int sum = 0;

        for(int i = 1; i < 10; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void printSumOf1UptoNUsingForLoop(int n)
    {
        int sum = 0;

        for(int i = 1; i < n; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void sumNumbers(String myStr)
    {
        String num = "";
        int total = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //iterate through the string
        for(int i = 0; i < myStr.length(); i++)
        {
            if(Character.isDigit(myStr.charAt(i))) //if a digit is reached..
            {
                num += Character.toString(myStr.charAt(i)); //append that digit to the num variable
                if(i == myStr.length() - 1) //if loop is at the last character..
                {
                    numbers.add(Integer.parseInt(
                            num)); //take whatevers in num so far, convert it to Integer, then add it to arraylist
                    break;
                }
                if(! Character.isDigit(myStr.charAt(i + 1)))
                { //if character after digit is a non-digit character..
                    numbers.add(Integer.parseInt(
                            num)); //take whatevers in num, convert it to Integer, then add it to arraylist
                    num = ""; //reset num variable
                }
            }
        }
        //iterate through array list
        for(Integer number : numbers)
        {
            total += number; //add up the numbers to find total
        }

        System.out.println(total); //print total
    }

    public static String notReplace(String sentence)
    {
        String newSentence = sentence.replaceAll("[\\s||-]is[\\s||\\.]", " is not ");
        if (newSentence.startsWith("is ")) {
            newSentence = newSentence.replaceFirst("is ", "is not ");
        }
        return newSentence.trim();
    }

}
