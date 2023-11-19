import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2단계 - 3
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if(A%4 ==0 && (A%100 !=0 || A%400==0)){
            System.out.println("1"); //윤년
        }else{
            System.out.println("0"); //윤년아님
        }
    }
}