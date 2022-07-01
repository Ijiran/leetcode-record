package top.pxyz.simple.s1592;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reorderSpaces("  this   is  a sentence "));
    }

    public String reorderSpaces(String text) {
        List<String> list = new ArrayList<>();
        int konggeCount = 0;
        String[] strings = text.split("");
        for (String string : strings){
            if(" ".equals(string)){
                konggeCount++;
            }
        }
        String[] dc = text.split(" ");
        for (String string : dc){
            if(!"".equals(string)){
                list.add(string);
            }
        }
        if(list.size() == 1 && konggeCount == 0){
            return list.get(0);
        }
        if(list.size() == 1){
            return list.get(0) + zh(konggeCount);
        }
        int sp = konggeCount / (list.size() - 1);
        int footer = konggeCount % (list.size() - 1);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                stringBuilder.append(list.get(i)).append(zh(footer));
            }else{
                stringBuilder.append(list.get(i)).append(zh(sp));
            }
        }
        return stringBuilder.toString();
    }

    public String zh(int length){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
