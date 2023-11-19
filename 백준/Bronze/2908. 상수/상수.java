import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        //5단계 - 9
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); //345
        String b = sc.next(); //567
        int ar = Integer.parseInt(reversing(a));
        int br = Integer.parseInt(reversing(b));
        if (ar > br){
            System.out.println(ar);
        }
        else {
            System.out.println(br);
        }
    }
    public static String reversing(String a){
        String reversed = "";
        //문자열 뒤에서부터 거꾸로 복사하여 reversed에 저장
        for(int i=a.length()-1; i>=0; i--){
            reversed += a.charAt(i);
        }
        return reversed;
    }
}