import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3단계 - 10
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i=1; i<=row; ++i) { //5줄 출력
            for(int j=row; j>i; --j) { //공백출력
                System.out.print(" ");
            }
            for(int j=1; j<=i; ++j){ //별출력
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }
    }
}