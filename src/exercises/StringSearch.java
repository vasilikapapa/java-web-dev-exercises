package exercises;
import java.util.Scanner;


public class StringSearch {
  public static void main(String [] args){
    String firstSentence="Alice was beginning to get very tired of sitting by her sister on the bank, and of having " +
            "nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
            "no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
            "'without pictures or conversation?'";
    firstSentence=firstSentence.toLowerCase();
    System.out.println("Enter a character to search: ");
    Scanner input= new Scanner(System.in);

    String searchTerm= input.next().toLowerCase();

    boolean found=false;
      Integer index = firstSentence.indexOf(searchTerm);
      Integer length = searchTerm.length();
    if(firstSentence.contains(searchTerm))
        found=true;
if(found)
      //System.out.println("The text contains " + yourInput);
    {
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
      String modifiedSentence = firstSentence.replace(searchTerm, "");
      System.out.println(modifiedSentence);}
else System.out.println("The text does not contain " + searchTerm);

  }
}
