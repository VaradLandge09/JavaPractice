package Strings;

import java.util.Arrays;

public class Asg3 {
    
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

    public static void reverseStringPreserveSeq(String str) {
        String ans = "";
        String[] val = str.split(" ");
        for(int i=0; i<val.length; i++) {
            int b=val[i].length()-1;
            while(b>=0) {
                ans += val[i].charAt(b);
                b--;
            }
            ans += " ";
        }
        System.out.println(ans);
    }

    public static void sortString(String str) {
        String ans="";
        str = str.toLowerCase();
        int[] ascii = new int[str.length()];
        for(int i=0; i<str.length(); i++) {
            ascii[i] = Integer.valueOf(str.charAt(i));
        }

        Arrays.sort(ascii);

        for(int i=0; i<str.length(); i++) {
            ans += (char)ascii[i];
        }
        
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // reverseStringPreserveSeq("legen dary");
        // System.out.println((char)65);
        sortString("Varad");
    }
}
