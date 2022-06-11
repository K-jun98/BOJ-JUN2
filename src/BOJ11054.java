import java.io.*;
import java.util.*;

class BOJ11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] dp = new int[N + 1];
        int[] mindp = new int[N + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Integer.parseInt(st.nextToken());
            mindp[i]=10000;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                mindp[i] = Math.min(mindp[i], mindp[i - j] + dp[j]);
            }
        }
        System.out.println(mindp[N]);
    }
}