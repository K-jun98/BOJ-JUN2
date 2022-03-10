import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arr = new int[9];
        int max2 = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (max < a) {
                max = a;
                max2 = i + 1;

            }

        }
        System.out.println(max);
        System.out.println(max2);
    }
}