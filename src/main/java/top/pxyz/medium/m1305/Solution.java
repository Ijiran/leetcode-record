package top.pxyz.medium.m1305;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 两棵二叉搜索树中的所有元素
 * @author Ijiran
 */
public class Solution {

    /**
     * 基于二叉树的特征，每一层所包含的值的数量是（层数-1）*2（除了第一层特殊）。
     * 每一层的末位是（层数=n） 2的(n+1)次方 - 2；为1时，就是4-2=2；为2时，就是8-2=6。
     * 每一层的首位是（层数=n）末位数字减去2的n次方。
     * todo 还没写完。
     * @param s
     * @param c
     * @return
     */
    public TreeNode convert(int[] s, int c){
        TreeNode treeNode = new TreeNode();
        if(c == 0){
            treeNode.val = s[c];
            convert(s, ++c);
        }else{
            int l, r;
            r = (int) Math.pow(2, 2 * c) - 2;
            l = r - (int) Math.pow(2, c);
            int z = 0;
            for (int i = l; i < r; i++) {
                if(i > s.length){
                    break;
                }

                z++;
            }
            convert(s, ++c);
        }
        return treeNode;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root1 = solution.convert(new int[]{1, 2}, 0);
        TreeNode root2 = solution.convert(new int[]{1, 2}, 0);
        System.out.println(solution.getAllElements(root1, root2));
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        if(root1 != null){
            addE(list, root1);
        }
        if(root2 != null){
            addE(list, root2);
        }
        return list.stream().sorted().collect(Collectors.toList());
    }

    private void addE(List<Integer> list, TreeNode node){
        list.add(node.val);
        if(node.left != null){
            addE(list, node.left);
        }
        if(node.right != null){
            addE(list, node.right);
        }
    }

}
