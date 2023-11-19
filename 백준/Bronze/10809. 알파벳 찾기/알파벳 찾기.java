import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5단계 - 6
        Scanner sc = new Scanner(System.in);
        String word = sc.next(); //단어입력
        sc.close();

        int[] positions = new int[26]; //알파벳 개수만큼의 배열
        for(int i=0; i<26; i++){
            positions[i] = -1; //-1로 초기화
        }

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i); //알파벳 하나 저장
            int index = c-'a'; //알파벳 a를 0, b를 1 ...로 변환
            if(positions[index] == -1){
                positions[index] = i;
            }
        }
        for(int p : positions){
            System.out.print(p + " ");
        }
    }
}