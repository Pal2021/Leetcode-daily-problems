import java.util.Scanner;
public class Reverse_Prefix_of_Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=sc.next().charAt(0);
        String result = reversePrefix(s, ch);
        System.out.println("Result: " + result);
    }

    private static String reversePrefix(String word, char ch) {
        int i;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                break;
            }
        }
        if (i == word.length()) return word;
        StringBuilder temp=new StringBuilder(word.substring(0,i+1)).reverse();
        return temp.toString()+word.substring(i+1);
    }
}
