import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurence {
    public static void main(String[] args) {
         String str = "abcdefgabcdefg";
        char a[] = str.toCharArray();
        HashMap<Character, Integer> lhm = new HashMap();
        for (char ch:a) {
            if (lhm.containsKey(ch)) {
                lhm.put(ch, lhm.get(ch) + 1);
            }
            else {
                lhm.put(ch, 1);
            }
        }
       
        for (Map.Entry<Character, Integer> m : lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        int max = Collections.max(lhm.values());
        char ch='\0';
        for (Map.Entry<Character, Integer> m : lhm.entrySet()) {
            if (m.getValue() == max) {
                if (ch == '\0' || m.getKey() < ch) {
                    ch = m.getKey();
                }
            }
        }
        System.out.println(ch);
    }
}
