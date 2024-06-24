package Strings;

public class Asg1 {

    public static void reverseString(String str) {
        String ans = "";
        int i=0;
        int j=str.length()-1;
        while(i<str.length()) {   
            ans += str.charAt(j);
            i++;
            j--;
        }
        System.out.println(ans);
    }

    public static boolean palindromeStr(String str) {
        int i=0, j=str.length()-1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }

    public static void changeCase(String str) {
        String ans = "";
        for(int i=0; i<str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                ans += Character.toUpperCase(str.charAt(i));
            }
            else {
                ans += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(ans);
    }

    public static void removeChar(String str, char c) {
        String ans = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != c) {
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void indexOfSubString(String str, String subStr) {
        int idx=-1;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == subStr.charAt(0)) {
                idx = i;
                for(int j=0; j<subStr.length(); j++) {
                    if(str.charAt(i) != subStr.charAt(j)) {
                        idx = -1;
                        break;
                    }
                    i++;
                }
            }
        }
        System.out.println(idx);
    }

    public static void main(String[] args) {
        // System.out.println(palindromeStr("level"));
        // String str = "a";
        // System.out.println(Character.isDigit(0));
        // indexOfSubString("paindlindrome", "po");
        String str = "AB";
        String str2 = "AB";
        System.out.println(str==str2);
    }
}
