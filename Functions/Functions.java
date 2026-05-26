import java.util.*;

public class Functions {
    public static int addThree(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean checkPrime(int a) {
        for (int i = 2; i * i <= a; ++i) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else {
            int product = 1;
            for (int i = 2; i <= n; ++i) {
                product *= i;
            }
            return product;
        }
    }

    public static boolean checkStrongNum(int n) {
        int sum = 0;
        int ori = n;
        while (n != 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        if (sum == ori) {
            return true;
        } else {
            return false;
        }
    }

    public static void guess(int n) {
        if (n < 1 && n > 100) {
            System.out.println("Not in range");
        }
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int secret = ran.nextInt(100) + 1;
        int guess;
        System.out.print("Enter a number: ");
        System.out.println();
        while (true) {
            guess = sc.nextInt();
            if (guess > secret) {
                System.out.println("Too High");
            } else if (guess < secret) {
                System.out.println("Too Low");
            } else {
                System.out.println("You gussed correct numberr");
                break;
            }

        }

    }

    public static int countFreq(int n, int digit) {
        int freq = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp == digit)
                ++freq;
            n /= 10;
        }
        return freq;
    }

    public static void fibonacciSeries(int n) {
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

    public static int tempFunc(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; ++i) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int nCr(int n, int r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static int nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static String concateString(String s1, String s2) {
        return s1 + s2;
    }

    public static int decimalToBinary(int x) {
        int value = 0;
        while (x != 0) {
            int bit = x % 2;
            value = value * 10 + bit;
            x /= 2;
        }
        int ans = 0;
        while (value != 0) {
            ans = ans * 10 + value % 10;
            value /= 10;
        }
        return ans;
    }

    public static int binaryToDecimal(int x) {
        int ans = 0;
        int power = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            ans += digit * Math.pow(2, power);
            ++power;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(binaryToDecimal(1101));
        // System.out.println(binaryToDecimal(9));
    }
}
