import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4단계 - 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        for(int num: numbers){ //배열은 이렇게 이용!
            if(num < x){
                System.out.print(num +" ");
            }
        }
        sc.close();
    }
}