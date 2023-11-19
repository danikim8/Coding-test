import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4단계 - 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); //공넣는 회수
        int[] baskets = new int[n]; //생성, 0초기화

        for(int i=0; i<m; i++){ //m번의 연산수행
            int start= sc.nextInt();
            int end = sc.nextInt();
            int k = sc.nextInt();
            for(int j=start-1; j<end; j++){ //start~end 바구니까찌 k번 공을 넣넣
                baskets[j] = k;
            }
        }
        for(int num : baskets){
            System.out.print(num + " ");
        }
        sc.close();
    }
}