import java.util.*;

public class Array {
    public static boolean Search(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    public static int IndexSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
