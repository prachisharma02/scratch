import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


class groupanagram {

    public static int gpanagram(List<String> words) {
        int count = 0;
       
        Map<String, List<String>> hm = new HashMap<>();
            

        for (String str : words) {
            char[] chararrr = str.toCharArray();
            Arrays.sort(chararrr);
            String sortstr = new String(chararrr);
            if (!hm.containsKey(sortstr)) {
                count++;
                hm.put(sortstr, new ArrayList<>());
            }
            hm.get(sortstr).add(str);
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("tea");
        ar.add("ate");
        ar.add("bat");
        ar.add("nat");
        ar.add("tan");
        ar.add("eat");
       
       gpanagram(ar);
    }
}