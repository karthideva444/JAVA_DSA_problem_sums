import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String name = "mdam";
        String name2 = "dmaam";
        if (reverse(name, name2)) {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
    public static boolean reverse(String name,String name2){

        char[] str1 = name.toCharArray();
        char[] str2 = name2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
