
// how to remove the duplicate character from String?

public class duplichar {
    public static void main(String[] args) {
        
        String str = "AABBCCDDEFG";

        char[] ch = str.toCharArray();
        StringBuilder res = new StringBuilder();


        for (int i = 0; i < ch.length; i++) {

            boolean isdupli = false;
             
            for (int j = 0; j < res.length(); j++) {
                if (ch[i] == res.charAt(j)) {
                    isdupli = true;
                    break;
                }
            }
            if (!isdupli) {
                res.append(ch[i]);
            }
        }
        System.out.println(str);
        System.out.println(res);
    }
}
