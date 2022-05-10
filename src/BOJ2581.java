import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10001];
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 10001; i++) {
            if (arr[i] == 0) {
                for (int j = i * 2; j < 10001; j += i) {
                    arr[j] = 1;
                }
            }
        }
        int sum = 0;
        int min = 0;
        for (int i = M; i <= N; i++) {
            if (arr[i] == 0) {
                if (min == 0) {
                    min += i;
                    sum += i;
                } else {
                    sum += i;
                }
            }
        }
        if (min == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

}


