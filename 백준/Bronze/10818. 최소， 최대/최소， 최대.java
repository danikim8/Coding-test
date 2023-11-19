import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4단계 - 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0], min = numbers[0];
        for(int num: numbers){ //배열은 이렇게 이용!
            if(num > max){
                max = num;
            }else{
                if(num<min){
                    min = num;
                }
            }
        }
        System.out.printf("%d %d", min, max);
        sc.close();
    }
}