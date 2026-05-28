public class Homework {
    public static int shortBetweenEven(int[] arr) {
        int size = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0)
                ++size;
        }
        int[] temp = new int[size];
        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 2 == 0) {
                temp[j] = i;
                j++;
            }
        }
        int distance = Integer.MAX_VALUE;
        if (size < 2) {
            return -1;
        }
        for (int i = 0; i < size - 1; ++i) {
            distance = Math.min(distance, temp[i + 1] - temp[i]);
        }
        return distance;
    }

    public static int[] AddElementAtSameIndex(int[] a, int[] b) {
        int n = 0;
        if (a.length <= b.length) {
            n = a.length;
        } else {
            n = b.length;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n && n >= 1 && n <= 5; ++i) {
            arr[i] = a[i] + b[i];
        }
        return arr;
    }

    public static int[] SubtractElementAtSameIndex(int[] a, int[] b) {
        int n = 0;
        if (a.length <= b.length) {
            n = a.length;
        } else {
            n = b.length;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = (a[i] >= b[i]) ? a[i] - b[i] : b[i] - a[i];
        }
        return arr;
    }

    public static int maxDistanceBetDuplicates(int[] arr) {
        int maxDistance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    int distance = j - i;
                    if (distance > maxDistance) {
                        maxDistance = distance;
                    }
                }
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 3, 4, 5, 6, 4, 4 };
        System.out.println(shortBetweenEven(arr));
    }
}
