import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures
{

    public static void main(String args[])
    {

        Cat garfield = new Cat("Garfield");
        Cat pinkPanther = new Cat("Pink Panther");
        Cat catWoman = new Cat("Catwoman");
        Cat tom = new Cat("Tom");
        Cat sylvester = new Cat("Sylvester");

        ArrayList<Cat> myCats = new ArrayList<Cat>();

        myCats.add(garfield);
        myCats.add(pinkPanther);
        myCats.add(catWoman);
        myCats.add(tom);
        myCats.add(sylvester);

        for(Cat cats : myCats)
        {
            System.out.println(cats.getName());
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(1);
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(2);
        myNumbers.add(2);

        mostFrequentElement(myNumbers);

        HashMap<String, Integer> podAges = new HashMap<String, Integer>();

        podAges.put("Tasha", 24);
        podAges.put("Ramona", 21);
        podAges.put("hans", 23);
        podAges.put("Jose", 24);
        podAges.put("Anthony", 21);

        System.out.println(canRentACar(podAges));

        ArrayList<String> myWords = new ArrayList<String>();
        myWords.add("Hello");
        myWords.add("to");
        myWords.add("There");
        myWords.add("we");
        myWords.add("go");

        System.out.println(wordsWithoutList(myWords, 2).size());

        ArrayList<Integer> clumps = new ArrayList<Integer>();
        clumps.add(1);
        clumps.add(3);
        clumps.add(1);
        clumps.add(2);
        clumps.add(3);

        System.out.println("Number of clumps in your array list: " + numOfClumps(clumps));

        wordsFromSentence("this Is my sentence.");

    }

    public static void mostFrequentElement(ArrayList<Integer> numbers)
    {
        HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>();

        for(int arrayListNum : numbers)
        {
            if(occurrences.containsKey(arrayListNum))
            {
                int amount = occurrences.get(arrayListNum);
                amount++;
                occurrences.put(arrayListNum, amount);
            }
            else
            {
                occurrences.put(arrayListNum, 1);
            }
        }

        int freq = 0;
        int winner = 0;
        for(int times : occurrences.keySet())
        {
            if(occurrences.get(times) > freq)
            {
                freq = occurrences.get(times);
                winner = times;
            }
        }
        System.out.println("most frequent number in arraylist is: " + winner + " with " + freq + " occurences");
    }

    public static boolean canRentACar(HashMap<String, Integer> podHashMap)
    {

        boolean canRentACar = false;

        for(String name : podHashMap.keySet())
        {
            if(podHashMap.get(name) >= 25)
            {
                canRentACar = true;
            }
            else canRentACar = false;
        }

        return canRentACar;

    }

    public static ArrayList<String> wordsWithoutList(ArrayList<String> listOfStrings, int num)
    {

        ArrayList<String> newList = new ArrayList<String>();
        for(String words : listOfStrings)
        {

            if(words.length() != num)
            {
                newList.add(words);
            }
        }

        return newList;
    }

    public static int numOfClumps(ArrayList<Integer> numbers)
    {
        //6, 6, 6, 1, 2, 4, 4, 0
        int prevNum = - 1;
        int clumps = 0;
        boolean foundClump = false;

        for(int num : numbers)
        {
            if(num == prevNum && foundClump == false)
            {
                foundClump = true;
                clumps++;
            }
            else if(num == prevNum && foundClump == true)
            {
                continue;
            }
            else
            {
                foundClump = false;
            }
            prevNum = num;

        }

        return clumps;

    }

    public static void wordsFromSentence (String sentence) {
        //"This is my sentence."

        ArrayList<String> wordsArray = new ArrayList<String>();
        String [] words = sentence.split(" ");

        for(int i = 0; i < words.length ; i++) {
            wordsArray.add(words[i]);
        }

        Collections.sort(wordsArray, String.CASE_INSENSITIVE_ORDER);

        for (String word : wordsArray) {
            System.out.println(word);
        }

    }
}



