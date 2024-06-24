package Strings;

public class Asg4 {
    
    public static void removeConsonants(String str) {
        String ans = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)==' ') {
                ans += str.charAt(i);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        removeConsonants("Hello, have a good day!");
    }
}
