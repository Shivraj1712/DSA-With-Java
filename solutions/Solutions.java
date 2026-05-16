package solutions;

import java.util.*;

public class Solutions {
    public int sqrt(int x) {
        int i;
        for (i = 0; i * i <= x; i++) {
            if (i * i == x)
                return i;
        }
        return i - 1;
    }

    public int factorial(int n) {
        if (n <= 1)
            return 1;
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return (int) fact;
    }
}