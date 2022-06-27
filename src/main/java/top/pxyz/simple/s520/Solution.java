package top.pxyz.simple.s520;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse("ABD"));
    }

    public boolean detectCapitalUse(String word) {
        int f = 0;
        if(Character.isUpperCase(word.charAt(0))){
            //大写
            f = 1;
        }else{
            //小写
            f = -1;
        }
        for (int i = 1; i < word.length(); i++) {
            if(f == -1 && Character.isUpperCase(word.charAt(i))){
                return false;
            }
            if(f == 1 && i != 1 && Character.isLowerCase(word.charAt(i))){
                return false;
            }

            if(Character.isUpperCase(word.charAt(i))){
                f = 1;
            }else{
                f = -1;
            }
        }
        //我对此题的解读，就是逻辑问题，利用排除法来解决特殊情况，如果一个特殊情况都不存在的话，就是正确的。

        //特殊情况如下：

        //1. 第一位是大写，后续可以小写，但是一旦是小写，就必须都是小写，一旦出现大写就返回false。

        //2. 第一位是小写，后续就出现了大写，就直接返回false即可。

        //下面我们就来一步一步的来讲述一下代码逻辑。
        //第一步，先声明出一个标识变量。

        //第二步，然后判断字符串第一位是大写还是小写。通过if来判断，并且给标识变量以不同的值。

        //第三步，开始进入循环，循环体内判断上面解读的两种情况，通过这两种情况来排除掉错误情况。

        //第四步，如果有幸完成循环，那么就代表着这个数字就是正确的。

        return true;
    }

}
