import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSumJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        int arraySize = 5;

        //Input: A single line of 5 positive space separated integers
        for (int i = 0; i < arraySize; i++) {
            numList.add(scanner.nextInt());
        }

        miniMaxSum(numList);
    }

    public static void miniMaxSum(List<Integer> arr) {
        //Find the min and max values possible by summing exactly 4 integers
        List<Long> numArray = new ArrayList<>();

        //Loop through and add 4 integers at a time with i being the integer to ignore
        for (int i = 0; i < arr.size(); i++) {
            long sum = 0;

            for (int j = 0; j < arr.size(); j++) {
                if (j != i) {
                    sum += arr.get(j);
                }
            }

            numArray.add(sum);
        }

        //Find the largest and smallest numbers
        findMinAndMax(numArray);

        //Output: Print the min and max values like so - 16 24
    }

    public static void findMinAndMax(List<Long> arr) {
        long smallestNum = arr.get(0);
        long largestNum = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > largestNum) {
                largestNum = arr.get(i);
            } else if (arr.get(i) < smallestNum) {
                smallestNum = arr.get(i);
            }
        }

        System.out.println(smallestNum + " " + largestNum);
    }
}
