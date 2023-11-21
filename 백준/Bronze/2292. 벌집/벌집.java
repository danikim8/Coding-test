import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //8단계 - 5
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //13

        int currentRoom = 1; //현재 방번호 초기화
        int distance = 1;

        while(currentRoom<n){
            currentRoom += 6*distance; // 다음 외곽 방 번호
            distance++;//이동 거리 증가
        }
        System.out.println(distance);
    }
}