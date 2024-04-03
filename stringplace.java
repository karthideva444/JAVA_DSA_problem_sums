// How do you reverse a given string in place

/**
 * stringplace
 */
// import java.lang.StringBuilder;

public class stringplace {

    // public static void main(String[] args) {
        
    //     String one = "karthi"; 
    //     StringBuilder build = new StringBuilder(one).reverse();
    //     System.out.println(build);

    // }
    public static void main(String[] args) {
        String arr = "karthi";
        char[] val =  arr.toCharArray();
        for (int i = val.length-1; i >=0 ; i--) {
            System.out.println(val[i]);
        }
    }
}