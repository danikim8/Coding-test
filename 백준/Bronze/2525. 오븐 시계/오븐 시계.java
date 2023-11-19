import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //2단계 - 6
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int needed = sc.nextInt();

        m += needed;
        h += m/60; // Add the whole hours from the total minutes to h
        m = m % 60; //remainder of
        h = h %24;
        System.out.printf("%d %d",h ,m);
    }
}