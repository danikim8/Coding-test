import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8단계 - 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //10진법 수,11
        int b = sc.nextInt(); //B진법,2
        String result = "";

        while(n>0){
            int remainder = n%b; //나머지 계산
            if(remainder>=10){
                //나머지가 10이상일때 알파벳으로 표현
                char remainderChar = (char)('A' + (remainder-10));
                result = remainderChar + result; //나머지를 결과 문자열의 앞에 추가
            }else {
                result = remainder + result;
            }
            n = n/b; //몫 업데이트
        }
        System.out.println(result);
    }
}