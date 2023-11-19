import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4단계 - 6
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); //공바꿀 회수
        int[] baskets = new int[n]; //생성, 0초기화
        for(int i=0; i<n; i++){
            baskets[i] = i+1;
        }
        for(int i=0; i<m; i++){ //m번의 연산수행
            int c1= sc.nextInt();
            int c2 = sc.nextInt();
            int temp = baskets[c1-1];
            baskets[c1-1] = baskets[c2-1];
            baskets[c2-1] = temp;
        }
        for(int num : baskets){
            System.out.print(num + " ");
        }
        sc.close();
    }
}