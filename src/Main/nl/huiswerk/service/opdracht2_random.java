package Main.nl.huiswerk.service;
import java.util.ArrayList;
import java.util.Random;

public class opdracht2_random {
    public static void main(String[] args) {
        //lege lijst aanmaken//
        ArrayList<Integer> lijst = new ArrayList<>();

        //random nummer genereren//
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = random.nextInt(10) + 1;
            //random nummer aan lijst toevoegen//
            lijst.add(randomNumber);
        }
        //check of getal in lijst oneven is en verwijder deze//
        lijst.removeIf(getal-> NumberChecker.checkEvenOrOdd(getal).equals("Number is uneven"));

        //print het resultaat//
        System.out.print(lijst);}

}
