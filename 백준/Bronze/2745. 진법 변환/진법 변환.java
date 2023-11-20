import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8단계 - 1
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); //수
        int b = sc.nextInt(); //진법
        int length = n.length();
        long total =0; //더 큰 결과를 다룰 수 있도록

        for(int i=0; i<n.length(); i++){
            char c = n.charAt(i);
            int digit;
            if(Character.isDigit(c)) {
                digit = c - '0';//숫자 문자를 숫자로 변환
            } else{
                digit = c - 'A' + 10; //알파벳 문자를 숫자로 변환
            }
            total += digit * Math.pow(b,length-1);
            length--;
        }
        System.out.println(total);
    }
}