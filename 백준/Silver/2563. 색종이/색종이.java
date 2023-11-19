import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //7단계 - 4
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] paper = new int[100][100];
        for(int i=0; i<100;i++){
            for(int j=0; j<100;j++){
                paper[i][j] = 0;
            }
        }
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j=y; j<y+10; j++){
                for(int k=x; k<x+10; k++){
                    paper[j][k] = 1;
                }
            }
        }
        int total = 0;
        for(int i=0; i<100;i++){
            for(int j=0; j<100;j++){
                total += paper[i][j];
            }
        }
        System.out.println(total);
    }
}