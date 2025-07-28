
public class NumberChecker {
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return ("Number is even");
        } else {
            return ("Number is uneven");
        }
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOrOdd(5));
    }
}