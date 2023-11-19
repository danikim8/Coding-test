import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //3단계 - 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Reads a line and converts it to an integer
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n;i++) {
            String[] inputs = br.readLine().split(" ");// Splits the line into two parts
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
             bw.write((a+b)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}