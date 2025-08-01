package Main.nl.huiswerk.service;

public class NumberChecker {

    public static String checkEvenOrOdd(int number) {
        return (number % 2 == 0) ? "Number is even" : "Number is uneven";
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Which number would you like to check? ");
        int input = scanner.nextInt();

        String result = checkEvenOrOdd(input);
        System.out.println(result);
    }
}
