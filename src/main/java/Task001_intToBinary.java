public class Task001_intToBinary {
    public static void main(String[] args) {
  /*Write a function that takes an integer as input, and returns the number of bits that are equal to one
  in the binary representation of that number. You can guarantee that input is non-negative.
  Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case*/

        System.out.println(countBits(5));
    }

    public static int countBits(int num) {
        if (num == 0) {
            System.out.println("0");
            return 0;
        }

        // Stores binary representation of number.
        int[] binaryNum = new int[32]; // Assuming 32 bit integer.
        int i = 0;

        for (; num > 0; ) {
            binaryNum[i++] = num % 2;
            num /= 2;
        }

        // Printing array in reverse order.
        String binary = "";
        for (int j = i - 1; j >= 0; j--) {
            binary = binary + binaryNum[j];
        }
        System.out.println(binary);
//        return Integer.parseInt(binary);
        int k = 0;
        for (int j = 0; j < binaryNum.length; j++) {
            if (binaryNum[j] == 1) {
                k++;
            }
        }
        return k;
    }
    public static int countBits1(int n){

        return Integer.bitCount(n);
    }

    public static int countBits2(int n){
        int ret = n % 2;
        while ((n /= 2) > 0) ret += n % 2;
        return ret;
    }
    public static int countBits3(int n){
        return (int) Integer.toBinaryString(n).chars()
                .filter(c -> c == '1')
                .count();
    }
}
