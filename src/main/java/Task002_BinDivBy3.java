import java.util.regex.Pattern;

public class Task002_BinDivBy3 {
    public static void main(String[] args) {
        System.out.println(multipleOf3().matcher("110").matches());
    }
    public static Pattern multipleOf3() {
        // Regular expression that matches binary inputs that are multiple of 3
        return Pattern.compile("(1(01*0)*1|0)*");
    }
    public static boolean ifDivisibleByThree(String number) {

        int oneOnEven = 0;
        int oneOnOdd = 0;

        for (int i = 0; i < number.length(); i += 2) {

            if (Character.compare(number.charAt(i), '1')==0) oneOnEven++;
            if (i + 1 < number.length() && Character.compare(number.charAt(i+1), '1')==0) oneOnOdd++;
        }
        System.out.println(oneOnEven + "  - " +oneOnOdd);
        if ( (oneOnEven - oneOnOdd) % 3 == 0) return true;
        else return false;
    }
}
