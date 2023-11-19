import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //5단계 - 8
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine(); //문자열 받
        sentence = sentence.trim(); //앞뒤 공백제거
        int cnt =0;
        int str; //아스키코드 값 저장 변수

        if(sentence.length() > 0){ //문자열이 비어있지 않으면 단어개수 ++
            cnt++;
        }
        //단어 사이의 공백의 개수 세기
        for(int i=1; i<sentence.length(); i++){ //두번째문자 - 마지막문자
            str = sentence.charAt(i); //문자의 아스키코드 값 변수에 저장.
            if(str == 32){ //현재가 공백문자,
                if(sentence.charAt(i-1) != 32){ //&& 이전문자가 공백이 아니면,
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}