import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[1_000_001];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= 1_000_000; i++) {
            arr[i] = (arr[i - 3] + arr[i - 2] + arr[i - 1])%1_000_000_009;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[Integer.parseInt(br.readLine())]);
        }
    }
}
