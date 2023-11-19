import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4단계 - 4
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        int max = -1;
        int index = -1;
        for(int i=0;i<9; i++){ //배열은 이렇게 이용!
            numbers[i] = sc.nextInt();
            if(numbers[i] > max){
                max = numbers[i];
                index = i+1;
            }
        }
        System.out.printf("%d\n%d\n", max, index);
        sc.close();
    }
}