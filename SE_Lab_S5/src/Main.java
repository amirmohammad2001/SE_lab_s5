import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press any key to start the program.: ");
        scanner.nextInt();

        long a = 99101151;
        long power = 99105612;
        long mod = 1000000007;

        System.out.println("Power Calculated! Result: " + powerFunction(a, power, mod));
    }

    public static long powerFunction(long a, long power, long mod) {
        if (power == 1) return a;
        if (power % 2 == 1) return (a * powerFunction(a, power/2, mod)) % mod;
        return (powerFunction(a, power/2, mod) * powerFunction(a, power/2, mod)) % mod;
    }

    public static long powerFunction2(long a, long power, long mod) {
        long result = 1;
        for (long i = 0; i < power; i++) {
            result = (result * a) % mod;
        }
        return result;
    }
}
