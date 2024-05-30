import java.util.Scanner;

class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int val){
        this.val=val;
    }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class new_Make_tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] input=sc.nextLine().split(" ");
        Integer [] arr=new Integer[input.length];
        for(int i=0;i<arr.length;i++){
            if(!input[i].equals("null")){
                arr[i]=Integer.parseInt(input[i]);
            }
        }
        //TreeNode1 root=createnodde(arr,0);
    }


}
