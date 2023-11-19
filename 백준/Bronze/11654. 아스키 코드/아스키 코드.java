import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //5단계 - 4
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0); //한글자를 받아 첫번째 문자 가져옴
        int asciiValue = (int) input;
        System.out.println(asciiValue);
        sc.close();
    }
}