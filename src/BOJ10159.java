import java.io.*;
import java.util.*;

 class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int K;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        if(K*N <= M) {
            System.out.println(0);
        }
        else {
            System.out.println(K*N - M);
        }
    }
}