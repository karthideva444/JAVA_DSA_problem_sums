import java.util.ArrayList;

public class overlap {
    public static void main(String[] args) {
        // [[1,3],[2,6],[8,10],[15,18]]

        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[1][i] < arr[i][1]) {
                // arr2.add(arr[1][i]);
                System.out.println("approved...");
                arr1.add(arr[i][0]);
                i++;
                arr2.add(arr[i][1]);                
                arr1.addAll(arr2);
                System.out.println(arr1); 
                System.out.println(arr);  
                
            }
        }
    }
}
