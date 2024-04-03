public class threesum {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int sum = 33;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = j; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==sum) {
                        int a = arr[i];
                        int b = arr[j];
                        int c = arr[k];
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);                        
                        System.out.println("the sum found between"+i+"and"+k);
                    }
                }
            }
        }

    }
}

