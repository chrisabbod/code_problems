public class MobileAppsCompanyOA {

    int i = 0;

    public static void main(String[] args) {
//        System.out.println(fibonacci(20));
//        System.out.println(hasEqualSum(1,2,5));
//        System.out.println(shouldWeWakeUp(true, 20));
        System.out.println(printEqual(1,2,3));
    }
    public static int fibonacci(int num) {
        int firstDigit = 0;
        int secondDigit = 1;
        int fibonacciNumber = 0;

        if (num == 0) { return firstDigit; }
        if (num == 1) { return secondDigit; }

        for (int i = 1; i < num; i++) {
            fibonacciNumber = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = fibonacciNumber;
        }
        return fibonacciNumber;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        // Return true if sum of 1 and 2 is equal to 3rd
        return num1 + num2 == num3;
    }

    public static boolean shouldWeWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            } else return hourOfDay < 8 || hourOfDay > 22;
        }
        return false;
    }

    public static String printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) return "Invalid value";
        if (num1 == num2 && num1 == num3) return "All numbers are equal";
        if (num1 != num2 && num1 != num3 && num2 != num3) return "All numbers are different";
        return "Neither all are equal or different";
    }
}

