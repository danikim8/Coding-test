import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5단계 - 7
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){//2번반복
            int r = sc.nextInt();//3
            String word = sc.next();//ABC

            for(int j=0; j<word.length(); j++){
//                char c = word.charAt(j); //A
                for(int k=0; k<r; k++){
                    System.out.print(word.charAt(j)); //AAA
                }
            }
            System.out.println();
        }
    }
}