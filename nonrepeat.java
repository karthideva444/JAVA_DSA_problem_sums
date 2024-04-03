// How do you print the first non-repeated character from a string?

public class nonrepeat {
    public static void main(String[] args) {
        String str = "karthi";

        str = str.toLowerCase();

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (ch[i] != ch[j]) {
                    System.out.println(ch[j]);
                } else {
                    System.out.println("invalid..");
                }
            }
        }
    }
}
