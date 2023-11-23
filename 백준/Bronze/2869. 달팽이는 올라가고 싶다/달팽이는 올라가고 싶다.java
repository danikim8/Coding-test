import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //8단계 - 7
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine()," ");
        int up = Integer.parseInt(st.nextToken()); //낮에 올라가는
        int down = Integer.parseInt(st.nextToken()); //밤에 미끄러지는
        int tree = Integer.parseInt(st.nextToken()); //나무 v미터
//        int day =0;
        //int sum =0;
//        while(true){
//            day++;
//            sum +=up; //올라가
//            if(sum>tree){ //도달시
//                break;
//            }
//            sum-= down; //미끄러짐
//        }
        int day = (tree - down) /(up-down); //잔여블록있으면 한번더 미끄러진후 올라가야함.
        if((tree-down)% (up-down)!= 0){ //나머지가 남는다면
            day++;
        }
        System.out.println(day);
    }
}