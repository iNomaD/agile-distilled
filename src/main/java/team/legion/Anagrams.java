package team.legion;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagrams {

    private Map<String, Set<String>> subCache = new HashMap<>();

    public Set<String> find(String input) {
        if (input.length() > 1) {
            Set<String> result = new HashSet<>();
            for (int i=0; i<input.length(); ++i) {
                char element = input.charAt(i);
                String subString = new StringBuilder(input).deleteCharAt(i).toString();
                Set<String> subRes = subCache.get(subString);
                if (subRes == null) {
                    subRes = find(subString);
                }
                for(String ending : subRes) {
                    result.add(element + ending);
                }
            }
            subCache.put(input, result);
            return result;
        } else {
            Set<String> result = new HashSet<>();
            result.add(input);
            return result;
        }
    }
}
