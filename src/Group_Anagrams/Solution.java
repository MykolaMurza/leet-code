package Group_Anagrams;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"a"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> table = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (table.containsKey(sorted)) {
                table.get(sorted).add(strs[i]);
            } else {
//                List<String> inner = new ArrayList<>();
//                inner.add(strs[i]);
                table.put(sorted, new ArrayList<>(Collections.singleton(strs[i])));
            }
        }

        return new ArrayList<>(table.values());
    }
}
