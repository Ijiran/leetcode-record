package top.pxyz.simple.s67;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        StringBuilder r = new StringBuilder();
        int aL = a.length() - 1;
        int bL = b.length() - 1;
        int flag = 0;
        while (aL >= 0 || bL >= 0){
            int aI = 0;
            if(aL >= 0){
                aI = a.charAt(aL) - 48;
            }
            int bI = 0;
            if(bL >= 0){
                bI = b.charAt(bL) - 48;
            }
            int j = aI + bI + flag;
            if(j >= 2){
                r.append(j - 2);
                flag = 1;
            }else{
                r.append(j);
                flag = 0;
            }
            aL--;
            bL--;
        }
        if(flag == 1){
            r.append(flag);
        }
        return r.reverse().toString();
    }
}
