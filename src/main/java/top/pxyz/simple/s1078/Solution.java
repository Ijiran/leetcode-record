package top.pxyz.simple.s1078;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findOcurrences("alice is a good girl she is a good student", "a", "good")));
    }

    public String[] findOcurrences(String text, String first, String second) {
        String[] textSplit = text.split(" ");
        int n = textSplit.length;
        List<String> list = new ArrayList<>();
        for (int i = 0; i + 2 < n; i++) {
            if (textSplit[i].equals(first) && textSplit[i + 1].equals(second)){
                list.add(textSplit[i + 2]);
            }
        }
        return list.toArray(new String[0]);
    }

}
