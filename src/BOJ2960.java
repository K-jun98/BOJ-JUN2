import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];
        int count = 0;

        for(int i=2;i<=N;i++) {
            if (arr[i] == 0) {
                for (int j = i; j <= N; j+=i) {
                    if (arr[j] == 0) {
                        arr[j] = 1;
                        count++;
                        if (count == K) {
                            System.out.println(j);
                           return;
                        }
                    }
                }
            }
        }
    }
}