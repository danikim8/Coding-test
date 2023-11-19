import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //3단계 - 12
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {//입력스트림에 다음 정수가 있는지 확인
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();//스캐너를 닫아야함.
    }
}