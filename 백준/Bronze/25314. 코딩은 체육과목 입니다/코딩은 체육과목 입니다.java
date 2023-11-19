import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3단계 - 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n/4;i++){
            System.out.printf("long ");
        }
        System.out.printf("int");
    }
}