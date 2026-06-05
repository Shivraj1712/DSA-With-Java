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
    public void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public static void OptRotataArray(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
    public static void bruteForceRotateArray(int [] arr,int k){
        int [] ans = new int[arr.length];
        int index = 0;
        for(int i = k + 1 ; i < arr.length ; ++i ){
            ans[index] = arr[i];
            index++; 
        }
        for(int i = 0 ; i <= k ; ++i){
            ans[index] = arr[i];
            index++;
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        bruteForceRotateArray(arr,k);
        
    }
}
