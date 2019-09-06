import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int answer;

        System.out.println("\nPrime numbers\n\nChoose:\n\n1) Find out if a random number (0-250) is prime or not\n2) Find out all prime numbers up to the number of your choice\n");
        answer = kb.nextInt();

        if (answer == 1) {
            int number;
            Random random = new Random();

            number = random.nextInt(250);

            System.out.println(number + (isPrime(number) ? " is" : " is not") + " a prime number.");
        }
        else if (answer == 2) {
            System.out.println("Enter a number: ");
            int number = kb.nextInt();

            for (int i = 0; i <= number; i++){
                System.out.println(i + (isPrime(i) ? " is" : " is not") + " a prime number.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}