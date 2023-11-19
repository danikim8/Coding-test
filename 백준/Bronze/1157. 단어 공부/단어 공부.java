import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6단계 - 5
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        int[] alphabetCount = new int[26];

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(Character.isLetter(c)){
                alphabetCount[c-'a']++;
            }
        }
        int maxCount =0;
        char mostFrequentChar = '?';
        for(int i=0; i<26; i++){
            if(alphabetCount[i]>maxCount){
                maxCount = alphabetCount[i];
                mostFrequentChar = (char) ('A'+i); //대문자로 저장
            } else if (alphabetCount[i]==maxCount) { //가장 많이 사용된 알파벳 여러개 존재시
                mostFrequentChar = '?';
            }
        }
        System.out.println(mostFrequentChar);
    }
}