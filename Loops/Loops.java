import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing numbers from 1 to 5 using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("\nCounting down using a while loop:");
        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }
        sc.close();
    }
}