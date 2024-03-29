import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private final static int MAX = 30;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(reader.readLine());
        int[][] dp = new int[MAX + 1][MAX + 1];

        for (int i = 1; i <= MAX; i++) {
            dp[i][1] = i;
        }

        for (int j = 2; j <= MAX; j++) {
            for (int k = 2; k <= MAX; k++) {
                dp[j][k] = dp[j - 1][k - 1] + dp[j - 1][k];
            }
        }

        for (int i = 0; i < testCase; i++) {
            List<Integer> input = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(
                    Collectors.toList());
            int n = input.get(1);
            int r = input.get(0);

            System.out.println(dp[n][r]);
        }
    }
}
