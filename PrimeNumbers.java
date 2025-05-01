import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(11);
        numbers.add(13);
        numbers.add(14);
        numbers.add(20);

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " is a prim number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

