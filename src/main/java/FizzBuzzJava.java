import java.util.Scanner;

class FizzBuzzJava {

    public static void main(String[] args) {

        int userInput;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        userInput = scanner.nextInt();

        fizzBuzz(userInput);
    }

    public static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {

            //If 3 & 5 are multiples of the current number
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}