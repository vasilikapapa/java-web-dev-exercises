package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
//        for (int element: integerArray) {
//            System.out.println(element);
//        }
        for (int element : integerArray) {
            if (element % 2 != 0)
                System.out.println(element);
        }
        //////////////
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        //split the string into separate sentences.
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}