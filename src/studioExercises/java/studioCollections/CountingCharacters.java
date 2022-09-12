package studioExercises.java.studioCollections;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

        public static void main(String args [])
        {
            String inputText = "If the product of two terms" +
                    " is zero then common sense says at least one " +
                    "of the two terms has to be zero to start with. " +
                    "So if you move all the terms over to one side," +
                    " you can put the quadratics into a form that can " +
                    "" +
                    "be factored allowing that side of the equation to equal zero. " +
                    "Once you've done that, it's pretty straightforward from there.";

            char[] charactersInString = inputText.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
            HashMap<Character, Integer> countCharacters= new HashMap<>();


            for(char character: charactersInString)
            {
                if(countCharacters.containsKey(character))
                {
                    countCharacters.put(character,countCharacters.get(character)+1);
                }
                else
                {
                    countCharacters.put(character,1);
                }
            }
            for (Map.Entry<Character, Integer> character: countCharacters.entrySet()) {
                System.out.println(character.getKey() + ":" + character.getValue());
            }
        }

}
