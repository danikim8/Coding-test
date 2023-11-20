import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8단계 - 3
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        int q,d,n,p;
        for(int i=0; i<loop; i++){
            int c = sc.nextInt();
            q=d=n=p=0;
            int remainder =0;
            while(c>0){
                if(c>=25){
                    q = c/25;
                    remainder = c%25;
                    c = remainder;
                }else if (c>=10){
                    d = c/10;
                    remainder = c%10;
                    c = remainder;
                } else if (c>=5) {
                    n =c/5;
                    remainder = c%5;
                    c=remainder;
                } else if (c>=1) {
                    p=c;
                    c=0;
                }
            }
            System.out.printf("%d %d %d %d\n",q,d,n,p);
        }
    }
}
