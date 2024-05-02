import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public static void main(String[] args) {
        List<Integer>arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr.add(temp);
        }

        System.out.println(findMaxK(arr));
    }

    private static int findMaxK(List<Integer> arr) {
    HashMap<Integer,Integer>mp=new HashMap<>();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)<0){
            int count= mp.getOrDefault(arr.get(i),0);
            mp.put(arr.get(i),count+1);
        }
    }
    int ans=-1;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>0){
            if(mp.containsKey(-arr.get(i))){
                ans=Math.max(ans,arr.get(i));
            }
        }
    }
    return ans;
    }
}
