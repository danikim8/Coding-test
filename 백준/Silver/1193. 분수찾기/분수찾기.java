import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8단계 - 6
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

//        1그룹:  1/1 , 개수는 그룹번호
//        2그룹:  1/2 2/1
//        3그룹:  3/1 2/2 1/3
//        4그룹:  1/4 2/3 3/2 4/1
        //홀수 그룹은 분자가 감소하고, 분모가 증가한다.
        //짝수 그룹은 분자가 증가하고, 분모가 감소한다.
        //line=라인수, 각행 마지막 번호는 line*(line+1)/2
        //분자+분모 = line +1
        //예시 - 홀수라인3, 4번째, 3/1
        //분자 3 = 1+   3*(3+1)/2    -4 = 1+ 라인마지막수(=cnt) -내번호  == 1+6-4
        //분모 1 = line+1-분자 = line +1 -(1+라인마지막수-내번호) = line +내번호 -라인마지막수

        int line =0; //라인수
        int cnt=0; //해당라인 마지막수 구할 변수
        int top = 0; //분자
        int bottom =0; //분모

        while(cnt<x){
            line++;
            cnt = line*(line+1)/2; //해당라인 마지막수 구함, 몇번째 행인지 찾는 코드
        }

        if(line %2 !=0){
            //홀수라인
            //분자+분모 = 1+line
            top = 1+ cnt-x; //분자 = 1+  line*(line+1)/2   -x;
            bottom = line +x -cnt; //분모 = 1 +line -분자
        }else {
            //짝수라인
            //홀수라인 케이스와 반대
            bottom = 1+cnt-x;
            top = line+x-cnt;
        }
        System.out.println(top+"/"+bottom);
    }
}