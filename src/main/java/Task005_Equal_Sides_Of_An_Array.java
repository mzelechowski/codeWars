import java.util.stream.IntStream;

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

    public static int findEvenIndex(int[] arr) {
        int index = -1;
        int sumAtIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            int sumLeft = 0, sumRight = 0;
            for (int j = 0; j < i; j++) {
                sumLeft = arr[j] + sumLeft;
            }

            for (int j = i + 1; j < arr.length; j++) {
                sumRight = arr[j] + sumRight;
            }
            if (sumLeft == sumRight && sumLeft < sumAtIndex) {
                index = i;
                sumAtIndex = sumLeft;
            }
        }
        return index;
    }

        public static int findEvenIndex1(int[] arr) {
            return IntStream.range(0, arr.length)
                    .filter(n -> IntStream.of(arr).limit(n).sum() == IntStream.of(arr).skip(n + 1).sum())
                    .findFirst().orElse(-1);
        }

}
