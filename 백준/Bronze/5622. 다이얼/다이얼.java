import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //5단계 - 10
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); //WA

        int time =0;
        for(char c : word.toCharArray()){ //문자열을 문자단위로 순회
            int num = getDialNumber(c);
            time += num+1;
        }
        System.out.println(time);
    }
    public static int getDialNumber(char c){
        //각 알파벳에 해당하는 숫자를 반환
        if(c >= 'A' && c <= 'C') return 2;
        else if(c >= 'D' && c <= 'F') return 3;
        else if(c >= 'G' && c <= 'I') return 4;
        else if(c >= 'J' && c <= 'L') return 5;
        else if(c >= 'M' && c <= 'O') return 6;
        else if(c >= 'P' && c <= 'S') return 7;
        else if(c >= 'T' && c <= 'V') return 8;
        else if(c >= 'W' && c <= 'Z') return 9;
        else return 0;
    }
}