package top.pxyz.simple.s551;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkRecord("PPALLP"));
    }

    public boolean checkRecord(String s) {
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                a++;
                b = 0;
            }else if(s.charAt(i) == 'L'){
                b++;
            }else{
                b = 0;
            }
            if(a == 2 || b == 3){
                return false;
            }
        }
        return true;
    }

}
