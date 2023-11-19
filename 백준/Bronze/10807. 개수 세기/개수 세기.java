import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4단계 - 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        int search = sc.nextInt();
        int count =0;
        for(int num: numbers){ //배열은 이렇게 이용!
            if(num == search){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}