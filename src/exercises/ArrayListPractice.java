package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void printWord(ArrayList<String> arr, int wordLength) {

        for (String element : arr) {
            if (element.length()==wordLength) {
                System.out.println(element);
            }
        }
    }
    public static void main (String [] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0;i<10;i++)
            arr.add(i);
        System.out.println( sumEven(arr));
        System.out.println("Enter a word length: ");
        Scanner input = new Scanner(System.in);
        int numChars = input.nextInt();
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        ArrayList<String> wordList= new ArrayList<String>(
                Arrays.asList(words));
printWord(wordList, numChars);

    }
}

