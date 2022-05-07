package top.pxyz.simple.s937;

import java.util.Arrays;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"})));
    }

    /**
     *
     * @param logs
     * @return
     */
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (l1, l2) -> {
            int idx1 = l1.indexOf(' ');
            int idx2 = l2.indexOf(' ');
            String s1 = l1.substring(idx1 + 1);
            String s2 = l2.substring(idx2 + 1);
            if (Character.isDigit(s1.charAt(0))) {
                if (Character.isDigit(s2.charAt(0))) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                if (Character.isDigit(s2.charAt(0))) {
                    return -1;
                } else {
                    return s1.compareTo(s2) == 0 ? l1.substring(0, idx1).compareTo(l2.substring(0, idx2)) :
                            s1.compareTo(s2);
                }
            }
        });
        return logs;
    }
}
