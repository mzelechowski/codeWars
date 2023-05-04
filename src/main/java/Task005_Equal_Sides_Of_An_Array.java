import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.Arrays;
import java.util.List;

public class Task005_Equal_Sides_Of_An_Array {
    public static void main(String[] args) {

//        You are going to be given an array of integers. Your job is to take that array and find an index N where the sum
//        of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that
//        would make this happen, return -1.
//        For example:
//        Let's say you are given the array {1,2,3,4,3,2,1}:
//        Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the
//        index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

        int[] numbers = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(findEvenIndex(numbers));

    }
    public static int findEvenIndex(int[] arr){
        int result=-1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Dla i rownego "+i);
            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft = arr[j] + sumLeft;
            }
            System.out.print(", wynik lewy: " +sumLeft);
            for (int j = i+1; j < arr.length; j++) {
                sumRight = arr[j] + sumRight;
            }
            System.out.println(", Wynik prawy: " +sumRight);
            if(sumLeft==sumRight){
                result=i;
            }
        }
        return result;
    }

}
