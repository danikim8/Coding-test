import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //4단계 - 7
        Scanner sc = new Scanner(System.in);
        boolean[] isPresent = new boolean[30]; //tracks if num has been inputted.
        for(int i=0;i<28;i++){
            int n = sc.nextInt();
            isPresent[n-1] = true; //mark the inputted number as present
        }
        for(int i=0;i<30;i++){
            if(!isPresent[i]){
                System.out.println(i+1);
            }
        }
        sc.close();
    }
}