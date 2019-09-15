package programmingQuestion;

/**
 * @ClassName ReConstructBinaryTree
 * @Descrcription 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @Author zzc
 * @Date 2019/9/14 9:58
 * @Version 1.0
 */
public class ReConstructBinaryTree {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0) {
            return null;
        }
        int len = pre.length;
        int node = pre[0];
        int leftCount = 0;
        int rightCount = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        int flag = 0;

        for (int i = 0; i < len; i++) {
            if (in[i] == node) {
                flag = 1;
            } else if (flag == 0) {
                leftCount++;
            } else {
                rightCount++;
            }
        }

        int[] leftPre = new int[leftCount];
        int[] rightPre = new int[rightCount];
        int[] leftIn = new int[leftCount];
        int[] rightIn = new int[rightCount];
        for (int i = 1; i <= leftCount; i++) {
            leftPre[leftIndex] = pre[i];
            leftIndex++;
        }
        for (int i = leftCount + 1; i < len; i++) {
            rightPre[rightIndex] = pre[i];
            rightIndex++;
        }
        flag = 0;
        leftIndex = 0;
        rightIndex = 0;
        for (int i = 0; i < len; i++) {
            if (in[i] == node) {
                flag = 1;
            } else if (flag == 0) {
                leftIn[leftIndex] = in[i];
                leftIndex++;
            } else {
                rightIn[rightIndex] = in[i];
                rightIndex++;
            }
        }

        TreeNode treeNode = new TreeNode(pre[0]);
        treeNode.left = reConstructBinaryTree(leftPre, leftIn);
        treeNode.right = reConstructBinaryTree(rightPre, rightIn);
        return treeNode;
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode treeNode = reConstructBinaryTree(pre, in);
    }
}

class TreeNode {
    int val;

    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.val = x;
    }
}
