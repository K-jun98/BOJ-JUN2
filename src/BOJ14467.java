import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] ints = new int[N + 1];
        Arrays.fill(ints, 3);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int cross = Integer.parseInt(st.nextToken());
            if (ints[cow] != cross&&ints[cow]!=3) {
                ints[cow] = cross;
                cnt++;
            }else if(ints[cow]==3){
                ints[cow]=cross;
            }
        }
        System.out.println(cnt);
    }
}
