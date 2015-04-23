import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by alexandraqin on 4/14/15.
 */


public class Conditionals {

  public static void main (String args[]) {

      System.out.println(isOdd(6));
      System.out.println(isMultipleOfThree(12));
      System.out.println(isOddAndIsMultipleOfThree(12));
      System.out.println(isOddAndIsMultipleOfThree2(12));
      fizzMultipleofThree(9);

      Person tommy = new Person("Tommyy");
      tommy.setCity("Detroit");
      System.out.println(isFromLondon(tommy));
      nameFiveCharacters(tommy);
      System.out.println(cigarParty(90, false));
      System.out.println(speeding(65, true));
      System.out.println(alarmclock(4, false));
      System.out.println(lotteryTicket(34,34,34));
      System.out.println(blackJack(8,20));
      System.out.println(evenlySpaced(10,5,15));
  }

    public static boolean isOdd(int num)
    {
        return (num % 2 == 1);
    }

    public static boolean isMultipleOfThree(int num)
    {
        return (num % 3 == 0);
    }

    public static boolean isOddAndIsMultipleOfThree(int num)
    {
        return (num % 3 == 0 && num % 2 == 1);
    }


    public static boolean isOddAndIsMultipleOfThree2(int num)
    {
        return (isOdd(num) && isMultipleOfThree(num));
    }

    public static void fizzMultipleofThree(int num)
    {
        if(isMultipleOfThree(num))
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(num);
        }
    }

    public static boolean isFromLondon(Person human)
    {
        return (human.getCity() == "London");
    }

    public static void nameFiveCharacters(Person human)
    {
        if(human.getName().length() > 5)
        {
            System.out.println(human.getName());
        }
        else
        {
            System.out.println("Name is too short");
        }

    }

    public static boolean cigarParty (int cigars, boolean weekend)
    {
        if (cigars >=40 && weekend)
            return true;
        else if (cigars >=40 && cigars <=60 && !weekend)
            return true;
        else
            return false;
    }

    public static int speeding (int speed, boolean birthday)
    {
        if (birthday) {
            if (speed <=65) {
                return 0;
            }
            else if (speed <= 85) {
                return 1;
            }
            else
                return 2;
        }
        else {
            if (speed <=60) {
                return 0;
            }
            else if (speed <= 80) {
                return 1;
            }
            else
                return 2;
        }
    }

    public static String alarmclock(int day, boolean vacation)
    {
        String strDay = String.valueOf(day);
        if (vacation) {
            if (strDay.matches("[1-5]"))
                return "10:00";
            else
                return "off";
        }
        else
        {
            if(strDay.matches("[1-5]")) return "7:00";
            else return "10:00";
        }
    }

    public static int lotteryTicket(int num1, int num2, int num3) {

        if (num1 == num2 && num2 == num3) {
            return 20;
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3) {
            return 0;
        }
        else
            return 10;

    }

    public static int blackJack(int num1, int num2) {

        if(num1 <= 21 && num2 <= 21) {
            if (num1 > num2) {
                return num1;
            }
            else
                return num2;
        }
        else
            return 0;
    }

    public static boolean evenlySpaced(int num1, int num2, int num3) {

        ArrayList<Integer> numArray = new ArrayList<Integer>();
        numArray.add(num1);
        numArray.add(num2);
        numArray.add(num3);
        Collections.sort(numArray);

        int difference1 = (Math.abs(numArray.get(0) - numArray.get(1)));
        int difference2 = (Math.abs(numArray.get(1) - numArray.get(2)));

        if (difference1 == difference2) {
            return true;
        }
        else
            return false;
    }
}
