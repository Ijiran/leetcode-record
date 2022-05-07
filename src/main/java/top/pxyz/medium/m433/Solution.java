package top.pxyz.medium.m433;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String start = "AAAAAAAA";
        String end = "CCCCCCCC";
        String[] bank = new String[]{"AAAAAAAA","AAAAAAAC","AAAAAACC","AAAAACCC","AAAACCCC","AACACCCC","ACCACCCC","ACCCCCCC","CCCCCCCA"};
        System.out.println(solution.minMutation(start, end, bank));
    }

    /**
     * 1.获取start和end两个值的不同点个数。
     * 2.根据不同点个数来判断正向是否能够达到。
     * 3.正向可以达到的话，就直接返回当前的不同点个数。
     * 4.否则开始反向探索。
     * @param start
     * @param end
     * @param bank
     * @return
     */
    public int minMutation(String start, String end, String[] bank) {
        if(start.equals(end)){
            return 0;
        }
        if(bank.length == 0){
            return -1;
        }
        //判断是否存在
        boolean f = false;
        for(String s : bank){
            if (end.equals(s)) {
                f = true;
                break;
            }
        }
        if(!f){
            return -1;
        }
        int isNot = isNot(start, end);
        if(z(start, end, bank, isNot)){
            return isNot;
        }
        return f(start, end, bank);
    }

    /**
     * 正向获取
     * @param start
     * @param end
     * @param bank
     * @param isNot
     * @return
     */
    private boolean z(String start, String end, String[] bank, int isNot){
        while (isNot != 0){
            for (int i = 0; i < bank.length; i++) {
                String s = bank[i];
                if (isNot(start, s) == 1 && isNot(end, s) == isNot - 1) {
                    start = s;
                    isNot--;
                    break;
                }
                if (i == bank.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 反向获取
     * @param start
     * @param end
     * @param bank
     * @return
     */
    private int f(String start, String end, String[] bank){
        int result = -1;
        //先获取一个
        for (String s : bank) {
            if (isNot(end, s) == 1) {
                //再循环匹配
                String z = s;
                String old = end;
                int n = 0;
                while (n != -1 && isNot(start, z) != 1) {
                    for (int j = 0; j < bank.length; j++) {
                        if (isNot(z, bank[j]) == 1 && !old.equals(bank[j])) {
                            old = z;
                            z = bank[j];
                            n++;
                            break;
                        }
                        if (j == bank.length - 1) {
                            n = -1;
                            break;
                        }
                    }
                }
                if (result < ++n) {
                    result = n;
                }
            }
        }
        return result != -1 ? ++result : -1;
    }

    private int isNot(String source, String target){
        int num = 0;
        for (int i = 0; i < 8; i++) {
            if(source.charAt(i) != target.charAt(i)){
                num++;
            }
        }
        return num;
    }

}
