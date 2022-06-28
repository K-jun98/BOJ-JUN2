import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ints = new int[Integer.parseInt(st.nextToken())];
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            if (temp == 1) {
                ints[from - 1] = to;
            } else if (temp == 2) {
                for (int j = from - 1; j <= to - 1; j++) {
                    if (ints[j] == 1)
                        ints[j] = 0;
                    else
                        ints[j] = 1;
                }
            } else if (temp == 3) {
                for (int j = from - 1; j <= to - 1; j++) {
                    ints[j] = 0;
                }
            } else if (temp == 4) {
                for (int j = from - 1; j <= to - 1; j++) {
                    ints[j] = 1;
                }
            }
        }
        for (int k = 0; k < ints.length; k++) {
            System.out.printf(String.valueOf(ints[k])+" ");
        }
    }
}
