import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int fibonacciLength = 10;

        List<Integer> fibonacciSeries = new ArrayList<>();
        fibonacciSeries = fibonacci(fibonacciLength);

        print(fibonacciSeries);
    }

    public static List<Integer> fibonacci(int n) {
        int firstElement = 0;
        int secondElement = 1;

        List<Integer> fibSeries = new ArrayList<>();

        int numOne,numTwo,numThree;

        for (int i = 0; i < n; i++) {
            //Add previous two elements to get next element
            if (i == 0) {
                fibSeries.add(firstElement);
            } else if (i == 1) {
                fibSeries.add(secondElement);
            } else {
                numOne = fibSeries.get(i - 2);
                numTwo = fibSeries.get(i - 1);
                numThree = numOne + numTwo;
                fibSeries.add(numThree);
            }
        }

        return fibSeries;
    }

    public static void print(List<Integer> numArray) {
        System.out.println("The first " + numArray.size() + " numbers of the Fibonacci sequence:");

        for(int n : numArray) {
            System.out.print(n + " ");
        }
    }
}