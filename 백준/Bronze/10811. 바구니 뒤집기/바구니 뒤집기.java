import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //4단계 - 9
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); //역순 횟수
        int[] baskets = new int[n]; //생성, 0초기화
        for(int i=0; i<n; i++){
            baskets[i] = i+1;
        }
        for(int i=0; i<m; i++){ //m번의 연산수행
            int L= sc.nextInt() -1;
            int R = sc.nextInt()-1;
            for(int j=L,k=R; j<k; j++,k--){
                int temp = baskets[j];
                baskets[j] =baskets[k];
                baskets[k] = temp;
            }
        }
        for(int num : baskets){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
