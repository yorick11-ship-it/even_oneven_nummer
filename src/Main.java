import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which number would you like to check?");
        int number = scanner.nextInt();
        if (number %2 ==0){
            System.out.print("Number is even");
        } else {
            System.out.print("Number is uneven");
        }
    }}