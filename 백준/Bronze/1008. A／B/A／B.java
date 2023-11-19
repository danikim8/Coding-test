import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double result = A/(double)B; //하나는 더블이어야 함

        System.out.printf("%.9f\n", result);
    }
}