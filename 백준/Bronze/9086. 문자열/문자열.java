import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //5단계 - 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.next();
        }
        for(String each : s){
            if(each.length() >= 2){
                System.out.printf("%c%c\n",each.charAt(0),each.charAt(each.length()-1));
            }
            else {
                System.out.printf("%c%c\n",each.charAt(0),each.charAt(0));
            }
        }
    }
}