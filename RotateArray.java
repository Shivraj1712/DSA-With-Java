public class RotateArray {
    public static void reverse(int[] arr, int left, int right) {
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotataArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotataArray(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
