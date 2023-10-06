import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new int[K];
        long big = 0;

        for (int i = 0; i < K; i++) {
            int line = Integer.parseInt(br.readLine());
            arr[i] = line;
            big = Math.max(line, big);
        }

        long low = 1;
        long mid=0;
        long answer = 0;
        while (low <= big) {
            mid = (low + big) / 2;
            long count = count(mid);

            if (count >= N) {
                low = mid + 1;
                answer = mid;
            } else {
                big = mid - 1;
            }
        }

        System.out.println(answer);
    }

    public static long count(long length) {
        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] / length;
        }
        return answer;
    }
}
