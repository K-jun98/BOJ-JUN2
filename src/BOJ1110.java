import java.io.*;
import java.util.StringTokenizer;


public class BOJ1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        int e = a;
        int count = 1;
        while (true) {

            int b = e / 10;
            int c = e % 10;
            int d = b + c;

            e = Integer.parseInt(c + "" + (d % 10) + "");
            if (e == a) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}