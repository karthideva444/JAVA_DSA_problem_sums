
public class largestnum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,2};

        int max=-1;
        int smax=-1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax){
                smax=arr[i];
            }
        }
        System.out.println("large"+max);
        System.out.println("Slarge"+smax);
    }
}
