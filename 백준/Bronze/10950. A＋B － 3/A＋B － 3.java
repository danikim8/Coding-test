import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3단계 - 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a+b;
            System.out.println(result);
        }
    }
}