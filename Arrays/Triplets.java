public class Triplets {
    public static void triplets(int[] arr, int n) {
        System.out.println("Geometric triplets for the following are :");
        for (int i = 1; i < n; ++i) {
            int j = i - 1;
            while (j >= 0) {
                int k = i + 1;
                while (k < n) {
                    if (arr[i] * arr[i] == arr[j] * arr[k]) {
                        System.out.println("(" + arr[j] + " " + arr[i] + " " + arr[k] + ")");
                    }
                    ++k;
                }
                --j;
            }
        }
    }
}