public class duplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,6,4};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    int arr1=arr[i];
                    System.out.println(arr1);
                    
                }
            }
        }
    }
}
