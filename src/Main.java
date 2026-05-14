// src/Main.java
public class Main {
    // Ultra-simple primality test: checks divisibility up to sqrt(n)
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Prints primes from 2 up to max (default 100). Accepts optional arg: max
    public static void main(String[] args) {
        int max = 100;
        if (args.length > 0) {
            try { max = Integer.parseInt(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.println("Primes up to " + max + ":");
        for (int i = 2; i <= max; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }
}
