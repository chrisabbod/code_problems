import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LonelyIntegerJava {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrSize, lonelyInt;
        List<Integer> array = new ArrayList<>();

        //Input 1 - a single odd numbered integer n 1 <= n < 100, the number of integers in the array
        arrSize = scanner.nextInt();

        //Input 2 - contains n space-separated integers that describe the values in a
        for (int i = 0; i < arrSize; i++) {
            array.add(scanner.nextInt());
        }

        //Output - the integer that occurs only once
        lonelyInt = lonelyinteger(array);

        System.out.println(lonelyInt);
    }

    public static int lonelyinteger(List<Integer> a) {
        //Loop through array starting with first element searching for a matching pair
        for (int i = 0; i < a.size(); i++) {
            boolean breakFlag = false;
            int numToMatch = a.get(i);

            //Loop through entire array excluding current element and find matching number
            for (int j = 0; j < a.size(); j++) {

                if (j != i) {
                    if (numToMatch == a.get(j)) {
                        breakFlag = true;
                        break;
                    }
                }
            }

            if (breakFlag == false) {
                return numToMatch;
            }

        }

        return 0;
    }
}
