
public class stringfunctions {
    public static void main(String[] args) {
        String name = "karthi";

        char ch = name.charAt(0);
        char[] ans = name.toCharArray();
        String res = name.concat("  deva hi  ");
        String res1 = res.trim();
        String res2 = name.toUpperCase();
        boolean res3 = res1.equals(name);
        String res4 = res2.toLowerCase();
        boolean res5 = name.startsWith("k");
        boolean res6 = name.endsWith("i");
        int len  = name.length();

        for (int i = 0; i < ans.length; i++) {
            System.out.println("charAt in loop :"+name.charAt(i));
        }

        System.out.println("charAt index    :"+ch);
        System.out.println("concat          :"+res);
        System.out.println("trim            :"+res1);
        System.out.println("uppercase       :"+res2);
        System.out.println("Equals          :"+res3);
        System.out.println("lowercase       :"+res4);
        System.out.println("startswith      :"+res5);
        System.out.println("endswith        :"+res6);
        System.out.println("length          :"+len);
        
    }
}
