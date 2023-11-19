import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //7단계 - 2
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[9][9];
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int max = a[0][0];
        int r=0,c =0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(a[i][j]>=max){
                    max = a[i][j];
                    r = i+1;
                    c = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d\n",r,c);
    }
}