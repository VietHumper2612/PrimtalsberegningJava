public class Main {
    // Tjekker om et tal er et primtal
    public static boolean isPrime(long n) {
        if (n < 2) return false; // Tal mindre end 2 er ikke primtal
        if (n % 2 == 0) return n == 2; // 2 er det eneste lige primtal
        for (long i = 3; i * i <= n; i += 2) { // Tjek kun ulige divisorer op til kvadratroden
            if (n % i == 0) return false; // Fandt en divisor, ikke et primtal
        }
        return true; // Ingen divisorer fundet, tallet er et primtal
    }

    public static void main(String[] args) {
        int max = 10000000; // Standard øvre grænse for primtalsberegning
        if (args.length > 0) {
            try { max = Integer.parseInt(args[0]); } catch (NumberFormatException ignored) {} // Brug argument hvis angivet
        }
        // Gennemgå alle tal fra 2 til max og beregn om de er primtal
        for (int i = 2; i <= max; i++) {
            isPrime(i);
        }
    }
}
