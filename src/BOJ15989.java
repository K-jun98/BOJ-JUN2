import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int mod = 1_000_000_000;
        int[][] arr = new int[n+1][10];
        for (int i = 1; i < 10; i++) {
            arr[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0)
                    arr[i][j] = arr[i - 1][1] % mod;
                else if (j == 9)
                    arr[i][j] = arr[i-1][8] % mod;
                else
                    arr[i][j] = (arr[i-1][j - 1] + arr[i-1][j + 1])%mod;
            }
            }
        long result=0;
        for (int i = 0; i < 10; i++) {
            result+=arr[n][i];
        }
        System.out.println(result%mod);
    }
}
