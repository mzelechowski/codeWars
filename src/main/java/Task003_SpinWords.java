import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task003_SpinWords {
    public static void main(String[] args) {

/*      Write a function that takes in a string of one or more words, and returns the same string,
 but with all five or more letter words reversed (Just like the name of this Kata).
 Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 Examples:
 spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 spinWords( "This is a test") => returns "This is a test"
 spinWords( "This is another test" )=> returns "This is rehtona test"*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zadanie: ");
        String input = scanner.nextLine();
        System.out.println(spinWords(input));

    }

    public static String spinWords(String sentence) {
        String[] tab = sentence.trim().split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() > 4) {
                String reverseWord = "";
                for (int j = 0; j < tab[i].length(); j++) {
                    reverseWord = tab[i].charAt(j) + reverseWord;
                }
                tab[i] = reverseWord;
            }
            output.append(tab[i]);
            output.append(" ");
        }
        return output.toString().trim();
    }

    public String spinWords1(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }
}
