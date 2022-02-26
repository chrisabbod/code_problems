import java.util.*;

import static java.lang.Math.abs;

public class MinimumMoves {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        int finalMoveTotal = 0;

        System.out.println("To best see this problem in action simply create arrays with 2 elements each and a 3 digit value in each element");

        //Take input for number of elements of first array
        System.out.print("Size of Array One: ");
        int sizeOfArrOne = scanner.nextInt();

        //Take input for element of arrOne
        for (int i = 0; i < sizeOfArrOne; i++) {
            System.out.print("Enter a three digit number for element " + i + ": ");
            array1.add(scanner.nextInt());
        }

        //Take input for number of elements of second array
        System.out.print("Size of Array Two: ");
        int sizeOfArrTwo = scanner.nextInt();

        //Take input for element of arrTwo
        for (int i = 0; i < sizeOfArrTwo; i++) {
            System.out.print("Enter a three digit number for element " + i + ": ");
            array2.add(scanner.nextInt());
        }

        //System.out.println("Array1: " + array1);
        //System.out.println("Array2: " + array2);

        finalMoveTotal = minimumMoves(array1, array2);
        System.out.println(finalMoveTotal);
    }

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {

        List<Integer> numberOfMoves = new ArrayList<>();
        int totalNumberOfMoves = 0;

        for (int i = 0; i < arr1.size(); i++) {
            numberOfMoves.add(findMoves(arr1.get(i), arr2.get(i)));
        }

        for (int i = 0; i < numberOfMoves.size(); i++) {
            totalNumberOfMoves = totalNumberOfMoves + numberOfMoves.get(i);
        }

        //System.out.println("Total number of moves needed to match array: " + totalNumberOfMoves);

        return totalNumberOfMoves;
    }

    public static int findMoves(int arrOneNum, int arrTwoNum) {
        //Break both numbers into arrays to the digits can be worked on individually

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> totalDifference = new ArrayList<>();

        int numOne, numTwo, currentDifference, finalMoveCount = 0;

        do {
            arr1.add(arrOneNum % 10);
            arrOneNum /= 10;
        } while (arrOneNum > 0);

        do {
            arr2.add(arrTwoNum % 10);
            arrTwoNum /= 10;
        } while (arrTwoNum > 0);

        Collections.reverse(arr1);
        Collections.reverse(arr2);

        //System.out.println("Array One: " + arr1);
        //System.out.println("Array Two: " + arr2);

        //Compare element by element to get the distance remembering to take the absolute value
        for (int i = 0; i < arr1.size(); i++) {
            numOne = arr1.get(i);
            numTwo = arr2.get(i);
            currentDifference = numTwo - numOne;
            totalDifference.add(abs(currentDifference));
            //System.out.println("numOne: " + numOne);
            //System.out.println("numTwo: " + numTwo);
            //System.out.println("Difference: " + currentDifference);
        }

        //Add counter together and return
        for (int i = 0; i < totalDifference.size(); i++) {
            finalMoveCount = finalMoveCount + totalDifference.get(i);
        }
        //System.out.println("Final Move Count: " + finalMoveCount);
        return finalMoveCount;
    }
}
