import java.util.*;

public class Solutions {
    public static int sqrt(int x) {
        int i;
        for (i = 0; i * i <= x; i++) {
            if (i * i == x)
                return i;
        }
        return i - 1;
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        int k = 2;
        long fact = 1;
        while (k * k <= n) {
            fact *= k;
            k++;
        }
        return (int) fact;
    }

    public static boolean CheckPrime(int a) {
        int k = 2;
        while (k < a) {
            if (a % k == 0)
                return false;
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        // System.out.println(factorial(a));
        System.out.println(CheckPrime(a));
        sc.close();
    }
}