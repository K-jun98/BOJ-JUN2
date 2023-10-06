import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] name = new String[n];
        int[] points = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken();
            points[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < m; i++) {
            int point = Integer.parseInt(br.readLine());

            int low = 0;
            int high = n - 1;
            int cur = 0;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (point <= points[mid]) {
                    high = mid - 1;
                    cur = mid;
                } else {
                    low = mid + 1;
                }
            }
            sb.append(name[cur]+"\n");
        }
        System.out.println(sb);
    }

}
