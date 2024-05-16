import java.util.Scanner;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Evaluate_Boolean_Binary_Tree {
    public static boolean helper(TreeNode root) {
        if (root.val == 0 || root.val == 1) {
            return root.val == 1;
        } else if (root.val == 2) {
            return helper(root.left) || helper(root.right);
        } else if (root.val == 3) {
            return helper(root.left) && helper(root.right);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        Integer[] arr=new Integer[input.length];
        for(int i=0;i< input.length;i++){
            if(!input[i].equals("null")){
                arr[i]=Integer.parseInt(input[i]);
            }
        }
        TreeNode root = createTree(arr, 0);
        boolean result = helper(root);
        System.out.println(result);
    }

    private static TreeNode createTree(Integer[] arr, int idx) {
        if (idx >= arr.length || arr[idx] == null) {
            return null;
        }
        TreeNode root = new TreeNode(arr[idx]);
        int leftIdx = 2 * idx+1 ;
        int rightIdx = 2 * idx + 2;
        root.left = createTree(arr, leftIdx);
        root.right = createTree(arr, rightIdx);
        return root;
    }
}
