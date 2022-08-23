import java.util.ArrayList;
import java.util.Scanner;

public class PlusMinusJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arraySize;
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        //System input array size and create array
        System.out.print("Please enter size of array: ");
        arraySize = scanner.nextInt();

        //System input array elements (integers)
        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < arraySize; i++) {
            intArray.add(scanner.nextInt());
        }

        //Count the number of positives, negatives, and zeroes
        plusMinus(intArray);

        //Output proportion of positive values, negative values, and zeros
        //Ex. 2/5 positive numbers = 0.400000 (6 digit precision)
    }

    public static void plusMinus(ArrayList<Integer> arr) {
        //Iterate through list and find all positives, negatives, and zeros
        int arrSize = arr.size(), positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        double posRatio = getRatio(arrSize, positive);
        double negRatio = getRatio(arrSize, negative);
        double zRatio = getRatio(arrSize, zero);

        System.out.println(String.format("%.6f",posRatio));
        System.out.println(String.format("%.6f",negRatio));
        System.out.println(String.format("%.6f",zRatio));
    }

    public static double getRatio(int size, int num) {

        double ratio = (double)num/(double)size;

        return ratio;
    }
}
