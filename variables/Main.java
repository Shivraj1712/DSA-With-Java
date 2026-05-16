import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer Value: ");
        int integer = sc.nextInt();

        System.out.print("Enter a Float Value: ");
        float dec = sc.nextFloat();

        System.out.print("Enter a Long Value: ");
        long lon = sc.nextLong();

        System.out.println("\n--- Summary ---");
        System.out.println("Integer: " + integer);
        System.out.println("Float:   " + dec);
        System.out.println("Long:    " + lon);

        sc.close();
    }
}