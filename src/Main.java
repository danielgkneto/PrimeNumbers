//Write an application that will show the number and indicate whether or not it is prime. There are two ways that you can achieve this.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int number;
        Random random = new Random();

        number = random.nextInt(250);

        System.out.println(number + (isPrime(number) ? " is" : " is not") + " a prime number.");
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}