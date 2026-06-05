import java.util.Arrays;

public class MissingNumbers {
    public static int[] missingNumbers(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length; ++i) {
            if (arr[i] != i)
                count++;
        }
        int[] ans = new int[count];
        int j = 0;
        for (int i = 0; i <= arr.length; ++i) {
            if (arr[i] != i) {
                ans[j] = i;
                j++;
            }
        }
        return ans;
    }
}