package top.pxyz.difficulty.d591;

/**
 * 寻找两个正序数组的中位数
 * @author Ijiran
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.isValid("<TRUE><![CDATA[wahaha]]]><![CDATA[]> wahaha]]></TRUE>"));
//        System.out.println(solution.isValid("<A><A>/A></A></A>"));
//        System.out.println(solution.isValid("<A><A></A></A>"));
//        System.out.println(solution.isValid("<A><A>456</A>  <A> 123  !!  <![CDATA[]]>  123 </A>   <A>123</A></A>"));
//        System.out.println(solution.isValid("<A><A>456</A>  <A> 123  !!  <![CDATA[<![cdata]>]]>  123 </A>   <A><![CDATA[</A>]]>  </A>  <A>123</A></A>"));
        System.out.println(solution.isValid("<A"));
//        System.out.println(solution.isValid("<![CDATA[wahaha]]]><![CDATA[]> wahaha]]>"));
//        System.out.println(solution.isValid("<123456>"));
    }

    /**
     * 1.搞清概念。
     * 其实就和Java中Mybatis的XML文件是一样的规则，大差不差。
     * 标签必须前后对应（比如<DIV></DIV>）；标签必须闭合；标签内可以使用CDATA标签包裹其他标签；除去CDATA包含的值外，一旦存在<符号，就必须要开始闭合（内容中不能存在<）。
     * 2.思路分析
     * 头部标签：<DIV>
     * 尾部标签：</DIV>
     * a. 判断是否以头部标签开头，也就是是否以<开头。
     * b. 根据>的第一次出现设定为头部标签的长度，以此来截取出头部标签、尾部标签；经过处理后，判断头部标签和尾部标签是否相同。
     * c. 判断头部标签和尾部标签是否满足全大写、长度在1-9的范围内。
     * d. 处理多表头情况。
     * e. 除去CDATA的特殊情况外，判断内容中是否存在<符号。
     * f. 如果没有CDATA，则直接判断内容中是否存在<符号。
     * @param code
     * @return
     */
    public boolean isValid(String code) {
        //a. 判断是否以<开头
        if(code.charAt(0) != '<'){
            return false;
        }
        //a1. 处理掉所有规范的CDATA。
        code = removeCdata(code);
        if("".equals(code)){
            return false;
        }
        //b. 截取头部标签、尾部标签
        int length = code.length();
        int size = code.indexOf(">") + 1;
        if(size == 0 || size > length / 2){
            return false;
        }
        StringBuilder header = new StringBuilder(code.substring(0, size));
        String footer = header.insert(1,"/").toString();
        if(!code.contains(footer)){
            return false;
        }
        //c.
        if(header.length() > 11 || header.length() < 3){
            return false;
        }
        for (int i = 1; i < header.length() - 1; i++) {
            if(Character.isLowerCase(header.charAt(i))){
                return false;
            }
        }
        //d.
        String content = handleHF(code.substring(size, length - size - 1));
        return isBH(content);
    }

    /**
     * 处理多标签情况
     * @param content
     * @return
     */
    public String handleHF(String content){
        //a.
        if("".equals(content) || content.charAt(0) != '<'){
            return content;
        }
        //b. 截取头部标签、尾部标签
        int length = content.length();
        int size = content.indexOf(">") + 1;
        if(size > length / 2){
            return content;
        }
        StringBuilder header = new StringBuilder(content.substring(0, size));
        //c.
        if(header.length() > 11 || header.length() < 3){
            return content;
        }
        for (int i = 1; i < header.length() - 1; i++) {
            if(Character.isLowerCase(header.charAt(i))){
                return content;
            }
        }
        //
        String footer = header.insert(1,"/").toString();
        int footerIndex = content.indexOf(footer);
        if(footerIndex == -1){
            return content;
        }
        return handleHF(content.substring(footerIndex + footer.length()).trim());
    }

    public boolean handleCdata(String content){
        while (true){
            int cdataH = content.indexOf("<![CDATA[");
            if(cdataH != -1){
                String cdataT = content.substring(cdataH);
                int cdataF = cdataT.indexOf("]]>");
                if(cdataF == -1){
                    return false;
                }
                String nCdata0 = content.substring(0, cdataH);
                String nCdata1 = content.substring(cdataH + cdataF + 3);
                if(nCdata0.contains("<")){
                    return false;
                }else if(nCdata1.contains("<")){
                    return handleCdata(nCdata1);
                }else{
                    return true;
                }
            }else{
                return true;
            }
        }
    }

    public String removeCdata(String content){
        StringBuilder result = new StringBuilder(content);
        while (true){
            int cdataH = result.indexOf("<![CDATA[");
            if(cdataH != -1){
                int cdataF = result.indexOf("]]>");
                if(cdataF == -1){
                    break;
                }
                result.delete(cdataH, cdataF+3);
            }else{
                break;
            }
        }
        return result.toString();
    }

    private boolean isBH(String content){
        return !content.contains("<");
    }

}
