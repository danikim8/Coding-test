import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //5단계 - 1
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        System.out.println(s.charAt(n-1));
    }
}