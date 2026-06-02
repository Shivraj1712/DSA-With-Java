import java.util.*;
public class PalindromeCheck{
    public static boolean CheckIfPalindrome(int [] arr){
        int i = 0 , j = arr.length - 1;
        while(i <= j){
            if(arr[i] != arr[j]) return false;
            ++i;
            --j;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,2,1};
        if(CheckIfPalindrome(arr)){
            System.out.println("Yes its a palindrome");
        }else{
            System.out.println("No its not a palindrome");
        }
    }
}