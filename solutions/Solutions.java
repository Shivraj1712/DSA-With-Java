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

    public static int reverseInteger(int a) {
        long rev = 0;
        while (a != 0) {
            rev = rev * 10 + a % 10;
            a /= 10;
        }
        return (int) rev;
    }

    public static boolean palindrome(int n) {
        long rev = 0;
        int x = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        if (rev == x)
            return true;
        else
            return false;
    }

    public static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return gcd(b, a % b);
    }

    public static int sumOfDigits(int n) {
        long sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 20;
        }
        return (int) sum;
    }

    // first to nth term of the Fibonacci Series
    public static void FibonacciSeries(int n) {
        int num1 = 0, num2 = 1;
        System.out.print(num1 + "  " + num2 + "  ");
        while (n - 2 != 0) {
            int next = num1 + num2;
            System.out.print(next + "  ");
            num1 = num2;
            num2 = next;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int a = sc.nextInt();
        // System.out.println(factorial(a));
        // // System.out.println(palindrome(a));
        // System.out.println(gcd(5, 2));
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // // printSquares(a, b);
        // FibonacciSeries(10);

        // for (float i = -3; i <= 3; i += 0.1) {
        // for (float j = -4; j <= 4; j += 0.1) {
        // if (i * i + j * j == 25)
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < 5; ++i) {
        // for (int j = 0; j < i; ++j) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // for (int i = 5; i > 0; --i) {
        // for (int j = i; j > 0; --j) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < 5; ++i) {
        // for (int j = 0; j < i; ++j) {
        // System.out.print(j + 1);
        // }
        // System.out.println("");
        // }
        // for (int i = 5; i > 0; --i) {
        // for (int j = 1; j <= i; ++j) {
        // System.out.print(j);
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < 5; ++i) {
        // for (int j = 0; j < i; ++j) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 5 - i; ++j) {
        // System.out.print("* ");
        // }
        // System.out.println("");
        // // }
        // int stars = 1;
        // for (int i = 1; i <= 6; ++i) {
        // for (int j = 1; j <= stars; ++j) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // if (stars % 2 == 0)
        // stars += 2;
        // }
        int n = 7;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j)
                    System.out.print("*");
                else if (i == n - j - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}