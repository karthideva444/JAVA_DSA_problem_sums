// How do you count a number of vowels and consonants in a given string? 

public class vowelencounter {
    public static void main(String[] args) {
        
        String str = "Hello world";
        str = str.toLowerCase();

        int vowel = 0;
        int consonet = 0;

        for (char ch : str.toCharArray()) {
            if (ch>='a'&& ch<='z') {
                if (isVowel(ch)) {
                    vowel++;
                }else{
                    consonet++;
                }
            }
        }
        System.out.println("vowels :"+vowel);
        System.out.println("consonet :"+consonet);
        
    }
    private static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        else{
            return false;
        }
    }
}
