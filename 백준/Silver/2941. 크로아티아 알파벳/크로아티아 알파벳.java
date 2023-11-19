import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //6단계 - 6
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int cnt =0;
        int i=0;
        while (i<word.length()){
            char c = word.charAt(i);
            switch (c) {
                case 'c':
                    if (i + 1 < word.length() && (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-')) {
                        i += 2;
                    } else {
                        i++;
                    }
                    break;
                case 'd':
                    if (i + 2 < word.length() && word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') {
                        i += 3;
                    } else if (i + 1 < word.length() && word.charAt(i + 1) == '-') {
                        i += 2;
                    } else {
                        i++;
                    }
                    break;
                case 'l':
                case 'n':
                    if (i + 1 < word.length() && word.charAt(i + 1) == 'j') {
                        i += 2;
                    } else {
                        i++;
                    }
                    break;
                case 's':
                case 'z':
                    if (i + 1 < word.length() && word.charAt(i + 1) == '=') {
                        i += 2;
                    } else {
                        i++;
                    }
                    break;
                default:
                    i++;
                    break;
            }
            cnt++; //그 외엔 그냥 글자수대로 ++
        }
        System.out.println(cnt);
    }
}