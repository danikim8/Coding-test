import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //4단계 - 10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //과목 개수
        int[] array = new int[n];

        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        int maxN = array[0];
        //최대값 찾기
        for(int i=1;i<n;i++){
            if(array[i]>maxN){
                maxN = array[i];
            }
        }
        double sum=0;
        //새로운 성적 계산 및 합계 구하기
        for(int i=0; i<n;i++){
//            array[i] = (array[i]*100) / maxN; //이렇게 해야
//            sum+= array[i];
            sum += (double) array[i] / maxN * 100;
        }
        double newAvg = sum/n;
        System.out.println(newAvg);
        sc.close();
    }
}