import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //5단계 - 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//숫자 개수
        String numbers = sc.next(); //공백없이 숫자들을 문자열로 받음.
        sc.close();

        int sum =0;
        for(int i=0; i<n; i++){
            char digit = numbers.charAt(i);
            int digitReal = Character.getNumericValue(digit);
            sum += digitReal;
        }
        System.out.println(sum);
    }
}