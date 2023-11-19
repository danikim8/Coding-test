import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        //6단계 - 2
        Scanner sc = new Scanner(System.in);
        //킹,퀸,룩,비숍,나이트,폰
        int[] set = new int[6];
        for(int i=0; i<6; i++){
            set[i] = sc.nextInt();
        }
        for(int i=0; i<6; i++) {
            if(i<2){
                set[i] = 1 - set[i];
            } else if (i<5) {
                set[i] = 2 - set[i];
            } else {
                set[i] = 8-set[i];
            }
        }
        for(int i =0; i<6; i++){
            System.out.printf("%d ",set[i]);
        }
    }
}