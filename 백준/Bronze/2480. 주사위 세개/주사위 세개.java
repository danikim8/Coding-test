import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2단계 - 7
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int n3 = sc.nextInt();
        int result;

        if(n1 == n2 && n1 ==n3) {//3개
            result = 10000 + n1 * 1000;
        } else if(n1==n2 || n1==n3 || n2 ==n3) {//2개
            int sameNum = (n1 == n2 || n1==n3 )? n1: n2;
            result = 1000+sameNum*100;
        }
        else {
            int max = Math.max(n1,Math.max(n2,n3));
            result = max*100;
        }
        System.out.println(result);
    }
}
