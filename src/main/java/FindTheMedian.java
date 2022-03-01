import java.util.*;

public class FindTheMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numArray = new ArrayList<>();
        int arrSize, median;

        //Input - unsorted array
        System.out.println("Enter an odd number for the size of the array");
        arrSize = scanner.nextInt();

        System.out.println("Enter " + arrSize + " numbers to put into the array");
        for (int i = 0; i < arrSize; i++) {
            numArray.add(scanner.nextInt());
        }

        //Sort the array
        Collections.sort(numArray);
        System.out.println("Sorted Array: " + numArray);

        //Find the median
        median = findMedian(numArray);

        System.out.println(numArray.get(median));
    }

    public static int findMedian(List<Integer> arr) {
        //Dividing the size of the odd array in half will give us a value that rounds down to be the median of the array
        //Ex. 15 / 2 = 7.5 which the int will round down to 7 where 7 is the median element of an array of 15
        int median = arr.size() / 2;

        return median;
    }
}