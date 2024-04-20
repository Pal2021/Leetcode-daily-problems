import java.util.Scanner;
import java.util.*;
public class Find_All_Groups_of_Farmland{

private static void rec(int[][] land, int n, int m, int i, int j, int[] r, int[] c) {
    if (i < 0 || j < 0 || i >= n || j >= m || land[i][j] == 0) {
        return;
    }
    land[i][j] = 0;
    r[0]=Math.max(r[0],i);
    c[0]=Math.max(c[0],j);
    rec(land, n, m, i + 1, j, r, c);
    rec(land, n, m, i, j + 1, r, c);
}
private  static List<List<Integer>> solve(int[][] land) {
    List<List<Integer>> ans = new ArrayList<>();
   int n=land.length, m=land[0].length;
   for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
        if(land[i][j]==1){
            int[]r=new int[1];
            int[]c=new int[1];
            rec(land,n,m,i,j,r,c);
            List<Integer>temp=new ArrayList<>();
            temp.add(i);
            temp.add(j);
            temp.add(r[0]);
            temp.add(c[0]);
            ans.add(temp);
        }
    }
   }
    return ans;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int m=sc.nextInt();
      int [][] arr=new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
      }
     List<List<Integer>>ans=solve(arr);
     for(List<Integer>it:ans){
        System.out.println(it);
     }
   }

}