package HashMap;
import java.util.*;

public class FristOccurence {
    
    public static int occurence(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        for(int i = 0; i < str.length(); i++)
        {
            if(map.get(str.charAt(i)) == 1){
                ans = i;
                break;
            }
        }
        return ans;
    } 

    public static void main(String[] args) {
        
        String str = "VARDARVD";
        int a = occurence(str);
        System.out.println("The occurence of the unique element is : " + a);
    }
}
