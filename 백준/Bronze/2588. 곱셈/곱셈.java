import java.util.Scanner;public class Main {
    public static void main(String[] args) {
        //1단계 - 10
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt(); //271

        int b1 = B % 10; //1의 자리
        int b2 = (B/10) %10; //10의자리 = 27 - 7
        int b3 = B/100; //100의 자리 = 몫바로 나옴

        System.out.println(A*b1);
        System.out.println(A*b2);
        System.out.println(A*b3);

        System.out.println(A*B);

    }
}