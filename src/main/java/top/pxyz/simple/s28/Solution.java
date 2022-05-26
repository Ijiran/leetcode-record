package top.pxyz.simple.s28;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        "mississippi"
//        "issip"
//        System.out.println(solution.strStr("mississippi", "issip"));
        System.out.println(solution.strStr("abc", "c"));
    }

    public int strStr(String haystack, String needle) {
        if(needle == null || haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.length() - i < needle.length()){
                break;
            }
            if(haystack.charAt(i) == needle.charAt(0)){
                if(needle.length() == 1){
                    return i;
                }
                int c = 1;
                for (int j = i + 1; j < haystack.length(); j++) {
                    if(haystack.charAt(j) != needle.charAt(c)){
                        break;
                    }
                    c++;
                    if(c == needle.length()){
                        return i;
                    }
                }

            }
        }
        return -1;
    }

}
