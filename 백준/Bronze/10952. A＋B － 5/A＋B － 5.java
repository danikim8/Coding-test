import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3단계 - 11
        Scanner sc = new Scanner(System.in);
        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a ==0 && b ==0){
                break;
            }
            System.out.println(a+b);
        }
    }
}