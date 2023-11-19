import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //6단계 - 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //높이 중간 줄까지
        //위쪽 부분 출력
        for(int i=1; i<=n; i++){ //1-5줄
            for(int j=1; j<=n-i; j++){//4,3,2,1,0
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){//1,3,5,7,9
                System.out.print("*");
            }
            System.out.println();
        }
        //아래 부분 출력
        for(int i=n-1; i>=1; i--){//4-1줄
            for(int j=1; j<=n-i; j++){//1,2,3,4
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1;k++){//7,5,3,1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}