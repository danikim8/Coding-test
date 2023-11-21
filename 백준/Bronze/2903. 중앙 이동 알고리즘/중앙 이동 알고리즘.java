import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8단계 - 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //(2^n +1)^2, 초기: 2의2승, 3의2승, 5의2승, 9의2승
        // ->2,3,5,9 식으로 증가값은 1,2,4 ->2의0승,1승,2승,3승 식으로 증가
        System.out.println((int)Math.pow(Math.pow(2,n)+1,2));
    }
}