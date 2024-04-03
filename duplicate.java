// public How do you print duplicate characters from a string? 

/**
 * duplicate
 */
public class duplicate {

    public static void main(String[] args) {
        String name = "karthick";
        char[] val = name.toCharArray();
        
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length; j++) {
                if (i!=j && val[i]==val[j]) {
                    System.out.println("Duplicate Strings :"+val[i]);
                }                
            }
        }
    }
}
