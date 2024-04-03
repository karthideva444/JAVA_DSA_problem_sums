// How do you check if a string contains only digits?

public class isdigits {
    public static void main(String[] args) {
        
        String  str= "kart";

        if (str.matches("\\d+")) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        
    }
}
