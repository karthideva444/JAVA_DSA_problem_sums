
// public class reverse_string {

//     public static void main(String[] args){
//         String s1 = "karthi";
//         char[] c1 = s1.toCharArray();
//         for (int i = s1.length()-1; i >= 0; i--) {
//         System.out.print(c1[i]);
//         }
//     }
// }

/**
 * reverse_string
 */
/**
 * reverse_string
 */
public class reverse_string {

    static void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        String name = "karthi";
        StringBuilder res =new StringBuilder(name).reverse();
        System.out.println(res);
        
        // System.out.println(new StringBuilder(name).reverse().toString());
        // System.out.println(new StringBuilder(name).insert(0,"D"));
        // System.out.println(new StringBuilder(name).append("ck").insert(0,"D"));
        // System.out.println(new StringBuilder(name).delete(0, 1));
        // System.out.println(new StringBuilder(name).deleteCharAt(0));

    }


}


