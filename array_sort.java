
public class array_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        int max=-1;        
        int smax =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>max) {
                    smax = max;
                    max = arr[i];
                }else if(arr[i]< smax){
                    smax = arr[i];
                }
            }
        }
        System.out.println("largest num :"+max);
        System.out.println("slargest num :"+smax);

    }
}
