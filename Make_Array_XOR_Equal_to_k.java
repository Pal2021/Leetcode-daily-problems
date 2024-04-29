import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Make_Array_XOR_Equal_to_k {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k= sc.nextInt();;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            arr.add(t);
        }
        System.out.println(minOperations(arr,n,k));
    }

    private static int minOperations(List<Integer> nums, int n, int k) {
        int xor1=0;
        for(int i=0;i<nums.size();i++){
            xor1 ^= nums.get(i);
        }
        int ans=xor1^k;
        int res = 0;
        while (ans > 0) {
            if ((ans & 1)==1)
                res++;
            ans = ans >> 1;
        }
        return res;
    }
}
