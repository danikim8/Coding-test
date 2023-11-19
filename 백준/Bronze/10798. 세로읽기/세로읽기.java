import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //7단계 - 3
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        for(int i=0; i<5; i++){
            words[i] = sc.next();
        }
        int maxLength =0;
        for(int i=0; i<5; i++){
            maxLength = Math.max(maxLength,words[i].length());
        }
        //세로로 읽기
        StringBuilder result = new StringBuilder();
        for(int i=0; i<maxLength; i++){//열길이, 현재 세로로 읽을 열 번호
            for(int j=0; j<5; j++){//행, 다섯개의 단어중에서 어떤 단어를 현재 처리중인지
                if(i< words[j].length()){ //max길이까지 단어를 가지고 있을때만 추가
                    result.append(words[j].charAt(i));
                }
            }
        }
        System.out.println(result.toString());
    }
}