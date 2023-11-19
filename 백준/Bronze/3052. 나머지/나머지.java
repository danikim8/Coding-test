import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //4단계 - 8
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            array[i] = n % 42;
        }

        int counting=0;
        for(int i=0;i<10;i++) {//2
            boolean isUnique = true;
            for(int j=0; j<i; j++){//0 //1
                if(array[i] == array[j]){//i자리숫자로 같은지 전체비교. 같을시 멈춤.
                    isUnique =false;
                    break;
                }
            }
            if(isUnique){
                counting++;
            }
        }
        System.out.println(counting);
        sc.close();
    }
}