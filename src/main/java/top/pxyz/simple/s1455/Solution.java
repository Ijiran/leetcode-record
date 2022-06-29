package top.pxyz.simple.s1455;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPrefixOfWord("i love eating burger", "burg"));
    }

    /**
     * 根据题目的描述来看，其主要的目的是要在一个长字符串中，找出其中的以第二个字符串开头的单词位置。
     *
     * 并且保证了该长字符串中只包含纯字母单词，并且每个单词之间通过空格来隔开。
     *
     * 搞清最后的预期结果了，那么就好办了。
     *
     * 要遍历每一个单词，只需要通过split方法分割长字符串即可。
     *
     * 遍历过程中，可以通过indexOf来判断是否以第二个字符串开头。
     *
     * 两者结合就能得到结果了，下面来看一下具体的代码编写吧。
     *
     * @param sentence
     * @param searchWord
     * @return
     */
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] ss = sentence.split(" ");
        for (int i = 0; i < ss.length; i++) {
            if(ss[i].length() >= searchWord.length() && ss[i].indexOf(searchWord) == 0){
                return i + 1;
            }
        }
        return -1;
    }

}
