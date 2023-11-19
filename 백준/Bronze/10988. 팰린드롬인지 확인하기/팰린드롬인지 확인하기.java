import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        //6단계 - 4
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (isPalindrome(word)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    public static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}