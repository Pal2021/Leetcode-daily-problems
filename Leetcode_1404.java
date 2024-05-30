import java.util.Scanner;

public class Leetcode_1404 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println(numSteps(s));
    }

    private static int  numSteps(String s) {
        int count=0;
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>1){
            int n=sb.length();
            if(sb.charAt(n-1)=='1'){
                convert(sb);
            }else{
                sb=sb.deleteCharAt(n-1);
            }
            count++;
        }
        return count;
    }
    private static  void convert(StringBuilder s){
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == '1') {
            s.setCharAt(i, '0');
            i--;
        }
        if (i < 0) {
            s.insert(0, '1');
        } else {
            s.setCharAt(i, '1');
        }
    }
}
