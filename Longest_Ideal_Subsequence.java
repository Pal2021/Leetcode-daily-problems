import java.util.Arrays;
import java.util.Scanner;

public class Longest_Ideal_Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(longestIdealString(s,n));
    }

    private static int longestIdealString(String s, int k) {
        int [][]dp=new int[s.length()][28];
        for(int i=0;i<s.length();i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(s,k,0,'{',dp);
    }

    private static int rec(String s, int k,int idx, char curr, int[][] dp) {
        if (idx >= s.length()) {
            return 0;
        }
        if (dp[idx][curr - 'a'] != -1) {
            return dp[idx][curr - 'a'];
        }
        int take = Integer.MIN_VALUE;
        if (curr == '{' || Math.abs(curr - s.charAt(idx)) <= k) {
            take = 1 + rec(s, k, idx + 1, s.charAt(idx), dp);
        }
        int nottake = rec(s, k, idx + 1, curr, dp);
        return dp[idx][curr - 'a'] = Math.max(take, nottake);
    }
}
