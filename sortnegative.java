
import java.util.ArrayList;

// An array contains both positive and negative numbers in random order. 
// Rearrange the array elements so that all negative numbers appear before all positive numbers.
// Examples : 
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5

public class sortnegative {
    public static void main(String[] args) {
        int[] arr1 = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<0) {
                arr2.add(arr1[i]);
            }
            else{
                arr3.add(arr1[i]);
            }
        }
        arr2.addAll(arr3);
        System.out.println(arr2);
    }
}
